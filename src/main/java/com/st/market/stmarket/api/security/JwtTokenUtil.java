package com.st.market.stmarket.api.security;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.st.market.stmarket.api.security.service.PropertiesService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author janez
 * @see
 * @version 2019H
 * @since 06-29-2019
 */
@Component
public class JwtTokenUtil {

    @Autowired
    PropertiesService propertiesService;

    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    public Claims getAllClaimsFromToken(String token) {
        Map<String, String> properties = propertiesService.getMap();

        return Jwts.parser().setSigningKey(properties.get("SECRET_KEY")).parseClaimsJws(token).getBody();
    }

    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    public String generateToken(String email) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, email);
    }

    private String doGenerateToken(Map<String, Object> claims, String email) {
        Map<String, String> properties = propertiesService.getMap();

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(buildJSON(email))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + Long.parseLong(properties.get("EXPIRATION_TIME")) * 1000))
                .signWith(SignatureAlgorithm.HS512, properties.get("SECRET_KEY")).compact();
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        final String username = getUsernameFromToken(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private String buildJSON(String email) {
        JsonObject json = new JsonObject();
        json.addProperty("email", email);

        return json.toString();
    }

    public JsonObject getTokenInformation(String token) {
        try {
            Map<String, String> properties = propertiesService.getMap();

            Claims claim = Jwts.parser()
                    .setSigningKey(properties.get("SECRET_KEY"))
                    .parseClaimsJws(token)
                    .getBody();
            String cl = claim.get("sub").toString();
            return new Gson().fromJson(cl, JsonObject.class);
        } catch (Exception e) {
            return new JsonObject();
        }
    }

}
