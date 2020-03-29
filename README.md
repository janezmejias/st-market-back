# st-market-back

<div id="container">

<div id="header">

<div class="time" xmlns="">6.48 s</div>

# GlobalTest: **<span class="total" xmlns="http://www.w3.org/1999/xhtml">9 total,</span> <span class="passed">9 passed</span>**

<div id="treecontrol">

*   [Collapse](# "Collapse the entire tree below") |
*   [Expand](# "Expand the entire tree below")

</div>

</div>

<div id="content">

*   <span>_

    <div class="time">362 ms</div>

    _CleanUpTest</span>
    *   <span>_

        <div class="time">362 ms</div>

        __passed_CleanUpTest.clean</span>
        *   <span class="stdout">Hibernate:  
            select  
            user0_.id as id1_6_,  
            user0_.email as email2_6_,  
            user0_.login as login3_6_,  
            user0_.name as name4_6_,  
            user0_.password as password5_6_  
            from  
            "user" user0_  
            Hibernate:  
            delete  
            from  
            "user"  
            where  
            id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_4_,  
            nephrologi0_.clinic_id as clinic_i4_4_,  
            nephrologi0_.dedication_hours as dedicati2_4_,  
            nephrologi0_.nephrologist_id as nephrolo5_4_,  
            nephrologi0_.salary as salary3_4_  
            from  
            nephrologist_base_clinic nephrologi0_  
            Hibernate:  
            select  
            clinic0_.id as id1_1_0_,  
            clinic0_.administrator as administ2_1_0_,  
            clinic0_.capacity as capacity3_1_0_,  
            clinic0_.city_id as city_id7_1_0_,  
            clinic0_.clinic_type_id as clinic_t8_1_0_,  
            clinic0_.director as director4_1_0_,  
            clinic0_.email as email5_1_0_,  
            clinic0_.name as name6_1_0_,  
            city1_.id as id1_0_1_,  
            city1_.description as descript2_0_1_,  
            city1_.zone_id as zone_id3_0_1_,  
            zone2_.id as id1_7_2_,  
            zone2_.description as descript2_7_2_,  
            clinictype3_.id as id1_2_3_,  
            clinictype3_.description as descript2_2_3_  
            from  
            clinic clinic0_  
            left outer join  
            city city1_  
            on clinic0_.city_id=city1_.id  
            left outer join  
            zone zone2_  
            on city1_.zone_id=zone2_.id  
            left outer join  
            clinic_type clinictype3_  
            on clinic0_.clinic_type_id=clinictype3_.id  
            where  
            clinic0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_0_,  
            nephrologi0_.active as active2_3_0_,  
            nephrologi0_.email as email3_3_0_,  
            nephrologi0_.name as name4_3_0_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_0_,  
            nephrologi1_.id as id1_5_1_,  
            nephrologi1_.description as descript2_5_1_  
            from  
            nephrologist nephrologi0_  
            left outer join  
            nephrologist_type nephrologi1_  
            on nephrologi0_.nephrologist_type_id=nephrologi1_.id  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            delete  
            from  
            nephrologist_base_clinic  
            where  
            id=?  
            Hibernate:  
            delete  
            from  
            nephrologist_base_clinic  
            where  
            id=?  
            Hibernate:  
            select  
            clinic0_.id as id1_1_,  
            clinic0_.administrator as administ2_1_,  
            clinic0_.capacity as capacity3_1_,  
            clinic0_.city_id as city_id7_1_,  
            clinic0_.clinic_type_id as clinic_t8_1_,  
            clinic0_.director as director4_1_,  
            clinic0_.email as email5_1_,  
            clinic0_.name as name6_1_  
            from  
            clinic clinic0_  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            delete  
            from  
            clinic  
            where  
            id=?  
            Hibernate:  
            select  
            city0_.id as id1_0_,  
            city0_.description as descript2_0_,  
            city0_.zone_id as zone_id3_0_  
            from  
            city city0_  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            delete  
            from  
            city  
            where  
            id=?  
            Hibernate:  
            delete  
            from  
            city  
            where  
            id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_,  
            clinictype0_.description as descript2_2_  
            from  
            clinic_type clinictype0_  
            Hibernate:  
            delete  
            from  
            clinic_type  
            where  
            id=?  
            Hibernate:  
            delete  
            from  
            clinic_type  
            where  
            id=?  
            Hibernate:  
            delete  
            from  
            clinic_type  
            where  
            id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_,  
            zone0_.description as descript2_7_  
            from  
            zone zone0_  
            Hibernate:  
            delete  
            from  
            zone  
            where  
            id=?  
            Hibernate:  
            delete  
            from  
            zone  
            where  
            id=?  
            Hibernate:  
            delete  
            from  
            zone  
            where  
            id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_,  
            nephrologi0_.active as active2_3_,  
            nephrologi0_.email as email3_3_,  
            nephrologi0_.name as name4_3_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_  
            from  
            nephrologist nephrologi0_  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            delete  
            from  
            nephrologist  
            where  
            id=?  
            Hibernate:  
            delete  
            from  
            nephrologist  
            where  
            id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_,  
            nephrologi0_.description as descript2_5_  
            from  
            nephrologist_type nephrologi0_  
            Hibernate:  
            delete  
            from  
            nephrologist_type  
            where  
            id=?  
            Hibernate:  
            delete  
            from  
            nephrologist_type  
            where  
            id=?  
            Hibernate:  
            delete  
            from  
            nephrologist_type  
            where  
            id=?  
            </span>
*   <span>_

    <div class="time">959 ms</div>

    _UserTest</span>
    *   <span>_

        <div class="time">959 ms</div>

        __passed_UserTest.runAllCases</span>
        *   <span class="stdout">2020-03-29 10:52:20.937 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/user/create  
            2020-03-29 10:52:21.174 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST User(id=null, login=janezmejias, password=uc2013djHY6dmrmD/p6cmw==, name=Juan, email=janezmejias.09@gmail.com)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            "user"  
            (email, login, name, password, id)  
            values  
            (?, ?, ?, ?, ?)  
            2020-03-29 10:52:21.240 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/user/create  
            2020-03-29 10:52:21.353 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST User(id=null, login=janezmejias.09, password=OOPzf9dun8jIHP+dxMsACA==, name=Carlos, email=janezmejias.09@gmail.com)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            "user"  
            (email, login, name, password, id)  
            values  
            (?, ?, ?, ?, ?)  
            Hibernate:  
            select  
            user0_.id as id1_6_,  
            user0_.email as email2_6_,  
            user0_.login as login3_6_,  
            user0_.name as name4_6_,  
            user0_.password as password5_6_  
            from  
            "user" user0_  
            2020-03-29 10:52:21.367 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/user/update  
            2020-03-29 10:52:21.497 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : PUT User(id=546, login=janezmejias, password=uc2013djHY6dmrmD/p6cmw==, name=Juan - EDIT, email=janezmejias.09@gmail.com)  
            Hibernate:  
            select  
            user0_.id as id1_6_0_,  
            user0_.email as email2_6_0_,  
            user0_.login as login3_6_0_,  
            user0_.name as name4_6_0_,  
            user0_.password as password5_6_0_  
            from  
            "user" user0_  
            where  
            user0_.id=?  
            Hibernate:  
            update  
            "user"  
            set  
            email=?,  
            login=?,  
            name=?,  
            password=?  
            where  
            id=?  
            2020-03-29 10:52:21.509 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/user/listAll  
            2020-03-29 10:52:21.618 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ALL FROM -> com.cafeto.challenge.user.service.UserServiceHandler  
            Hibernate:  
            select  
            user0_.id as id1_6_,  
            user0_.email as email2_6_,  
            user0_.login as login3_6_,  
            user0_.name as name4_6_,  
            user0_.password as password5_6_  
            from  
            "user" user0_  
            Hibernate:  
            select  
            user0_.id as id1_6_,  
            user0_.email as email2_6_,  
            user0_.login as login3_6_,  
            user0_.name as name4_6_,  
            user0_.password as password5_6_  
            from  
            "user" user0_  
            2020-03-29 10:52:21.628 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/user/547  
            2020-03-29 10:52:21.722 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ONE FROM -> com.cafeto.challenge.user.service.UserServiceHandler WITH ID=547  
            Hibernate:  
            select  
            user0_.id as id1_6_0_,  
            user0_.email as email2_6_0_,  
            user0_.login as login3_6_0_,  
            user0_.name as name4_6_0_,  
            user0_.password as password5_6_0_  
            from  
            "user" user0_  
            where  
            user0_.id=?  
            Hibernate:  
            select  
            user0_.id as id1_6_,  
            user0_.email as email2_6_,  
            user0_.login as login3_6_,  
            user0_.name as name4_6_,  
            user0_.password as password5_6_  
            from  
            "user" user0_  
            2020-03-29 10:52:21.735 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/user/delete  
            2020-03-29 10:52:21.829 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : DELETE ONE OF -> com.cafeto.challenge.user.service.UserServiceHandler WITH ID=547  
            Hibernate:  
            select  
            user0_.id as id1_6_0_,  
            user0_.email as email2_6_0_,  
            user0_.login as login3_6_0_,  
            user0_.name as name4_6_0_,  
            user0_.password as password5_6_0_  
            from  
            "user" user0_  
            where  
            user0_.id=?  
            Hibernate:  
            delete  
            from  
            "user"  
            where  
            id=?  
            </span>
*   <span>_

    <div class="time">782 ms</div>

    _NephrologistTypeTest</span>
    *   <span>_

        <div class="time">782 ms</div>

        __passed_NephrologistTypeTest.runAllCases</span>
        *   <span class="stdout">2020-03-29 10:52:21.860 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-type/create  
            2020-03-29 10:52:21.959 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST NephrologistType(id=null, description=Tubulointerstitial kidney diseases)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            nephrologist_type  
            (description, id)  
            values  
            (?, ?)  
            2020-03-29 10:52:21.966 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-type/create  
            2020-03-29 10:52:22.053 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST NephrologistType(id=null, description=Electrolyte, fluid, and acid-base imbalances or disturbances)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            nephrologist_type  
            (description, id)  
            values  
            (?, ?)  
            2020-03-29 10:52:22.058 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-type/create  
            2020-03-29 10:52:22.148 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST NephrologistType(id=null, description=Glomerular conditions, such as glomerulonephritis and nephrotic syndrome)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            nephrologist_type  
            (description, id)  
            values  
            (?, ?)  
            2020-03-29 10:52:22.154 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-type/create  
            2020-03-29 10:52:22.242 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST NephrologistType(id=null, description=Advanced or chronic kidney disease)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            nephrologist_type  
            (description, id)  
            values  
            (?, ?)  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_,  
            nephrologi0_.description as descript2_5_  
            from  
            nephrologist_type nephrologi0_  
            2020-03-29 10:52:22.251 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-type/update  
            2020-03-29 10:52:22.340 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : PUT NephrologistType(id=548, description=Tubulointerstitial kidney diseases - EDITED)  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            update  
            nephrologist_type  
            set  
            description=?  
            where  
            id=?  
            2020-03-29 10:52:22.346 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-type/listAll  
            2020-03-29 10:52:22.440 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ALL FROM -> com.cafeto.challenge.nephrologistType.service.NephrologistTypeServiceHandler  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_,  
            nephrologi0_.description as descript2_5_  
            from  
            nephrologist_type nephrologi0_  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_,  
            nephrologi0_.description as descript2_5_  
            from  
            nephrologist_type nephrologi0_  
            2020-03-29 10:52:22.450 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-type/549  
            2020-03-29 10:52:22.535 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ONE FROM -> com.cafeto.challenge.nephrologistType.service.NephrologistTypeServiceHandler WITH ID=549  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_,  
            nephrologi0_.description as descript2_5_  
            from  
            nephrologist_type nephrologi0_  
            2020-03-29 10:52:22.546 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-type/delete  
            2020-03-29 10:52:22.631 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : DELETE ONE OF -> com.cafeto.challenge.nephrologistType.service.NephrologistTypeServiceHandler WITH ID=549  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            delete  
            from  
            nephrologist_type  
            where  
            id=?  
            </span>
*   <span>_

    <div class="time">736 ms</div>

    _NephrologistTest</span>
    *   <span>_

        <div class="time">736 ms</div>

        __passed_NephrologistTest.runAllCases</span>
        *   <span class="stdout">Hibernate:  
            select  
            nephrologi0_.id as id1_5_,  
            nephrologi0_.description as descript2_5_  
            from  
            nephrologist_type nephrologi0_  
            2020-03-29 10:52:22.653 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist/create  
            2020-03-29 10:52:22.754 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST Nephrologist(id=null, name=Dr. Mario Magnone, MD, nephrologistType=NephrologistType(id=550, description=Glomerular conditions, such as glomerulonephritis and nephrotic syndrome), email=mariomg@gmail.com, active=true)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            nephrologist  
            (active, email, name, nephrologist_type_id, id)  
            values  
            (?, ?, ?, ?, ?)  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_,  
            nephrologi0_.description as descript2_5_  
            from  
            nephrologist_type nephrologi0_  
            2020-03-29 10:52:22.791 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist/create  
            2020-03-29 10:52:22.879 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST Nephrologist(id=null, name=Dr. Frank S. Pettyjohn, MD, nephrologistType=NephrologistType(id=551, description=Advanced or chronic kidney disease), email=pettyjohn@gmail.com, active=true)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            nephrologist  
            (active, email, name, nephrologist_type_id, id)  
            values  
            (?, ?, ?, ?, ?)  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_,  
            nephrologi0_.description as descript2_5_  
            from  
            nephrologist_type nephrologi0_  
            2020-03-29 10:52:22.888 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist/create  
            2020-03-29 10:52:22.976 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST Nephrologist(id=null, name=Dr. Jhon S. Jhon, MD, nephrologistType=NephrologistType(id=550, description=Glomerular conditions, such as glomerulonephritis and nephrotic syndrome), email=jhon2two@gmail.com, active=true)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            nephrologist  
            (active, email, name, nephrologist_type_id, id)  
            values  
            (?, ?, ?, ?, ?)  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_,  
            nephrologi0_.active as active2_3_,  
            nephrologi0_.email as email3_3_,  
            nephrologi0_.name as name4_3_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_  
            from  
            nephrologist nephrologi0_  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            2020-03-29 10:52:22.991 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist/update  
            2020-03-29 10:52:23.082 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : PUT Nephrologist(id=552, name=Dr. Mario Magnone, MD - EDIT, nephrologistType=NephrologistType(id=550, description=Glomerular conditions, such as glomerulonephritis and nephrotic syndrome), email=mariomg@gmail.com, active=true)  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_1_,  
            nephrologi0_.active as active2_3_1_,  
            nephrologi0_.email as email3_3_1_,  
            nephrologi0_.name as name4_3_1_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_1_,  
            nephrologi1_.id as id1_5_0_,  
            nephrologi1_.description as descript2_5_0_  
            from  
            nephrologist nephrologi0_  
            left outer join  
            nephrologist_type nephrologi1_  
            on nephrologi0_.nephrologist_type_id=nephrologi1_.id  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            update  
            nephrologist  
            set  
            active=?,  
            email=?,  
            name=?,  
            nephrologist_type_id=?  
            where  
            id=?  
            2020-03-29 10:52:23.090 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist/listAll  
            2020-03-29 10:52:23.174 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ALL FROM -> com.cafeto.challenge.nephrologist.service.NephrologistServiceHandler  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_,  
            nephrologi0_.active as active2_3_,  
            nephrologi0_.email as email3_3_,  
            nephrologi0_.name as name4_3_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_  
            from  
            nephrologist nephrologi0_  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_,  
            nephrologi0_.active as active2_3_,  
            nephrologi0_.email as email3_3_,  
            nephrologi0_.name as name4_3_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_  
            from  
            nephrologist nephrologi0_  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            2020-03-29 10:52:23.193 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist/553  
            2020-03-29 10:52:23.282 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ONE FROM -> com.cafeto.challenge.nephrologist.service.NephrologistServiceHandler WITH ID=553  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_0_,  
            nephrologi0_.active as active2_3_0_,  
            nephrologi0_.email as email3_3_0_,  
            nephrologi0_.name as name4_3_0_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_0_,  
            nephrologi1_.id as id1_5_1_,  
            nephrologi1_.description as descript2_5_1_  
            from  
            nephrologist nephrologi0_  
            left outer join  
            nephrologist_type nephrologi1_  
            on nephrologi0_.nephrologist_type_id=nephrologi1_.id  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_,  
            nephrologi0_.active as active2_3_,  
            nephrologi0_.email as email3_3_,  
            nephrologi0_.name as name4_3_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_  
            from  
            nephrologist nephrologi0_  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            2020-03-29 10:52:23.291 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist/delete  
            2020-03-29 10:52:23.376 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : DELETE ONE OF -> com.cafeto.challenge.nephrologist.service.NephrologistServiceHandler WITH ID=553  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_0_,  
            nephrologi0_.active as active2_3_0_,  
            nephrologi0_.email as email3_3_0_,  
            nephrologi0_.name as name4_3_0_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_0_,  
            nephrologi1_.id as id1_5_1_,  
            nephrologi1_.description as descript2_5_1_  
            from  
            nephrologist nephrologi0_  
            left outer join  
            nephrologist_type nephrologi1_  
            on nephrologi0_.nephrologist_type_id=nephrologi1_.id  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            delete  
            from  
            nephrologist  
            where  
            id=?  
            </span>
*   <span>_

    <div class="time">926 ms</div>

    _ZoneTest</span>
    *   <span>_

        <div class="time">926 ms</div>

        __passed_ZoneTest.runAllCases</span>
        *   <span class="stdout">2020-03-29 10:52:23.394 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/zone/create  
            2020-03-29 10:52:23.511 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST Zone(id=null, description=CENTRO)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            zone  
            (description, id)  
            values  
            (?, ?)  
            2020-03-29 10:52:23.518 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/zone/create  
            2020-03-29 10:52:23.622 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST Zone(id=null, description=OCCIDENTE)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            zone  
            (description, id)  
            values  
            (?, ?)  
            2020-03-29 10:52:23.627 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/zone/create  
            2020-03-29 10:52:23.734 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST Zone(id=null, description=NORTE)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            zone  
            (description, id)  
            values  
            (?, ?)  
            2020-03-29 10:52:23.740 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/zone/create  
            2020-03-29 10:52:23.851 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST Zone(id=null, description=SUR)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            zone  
            (description, id)  
            values  
            (?, ?)  
            Hibernate:  
            select  
            zone0_.id as id1_7_,  
            zone0_.description as descript2_7_  
            from  
            zone zone0_  
            2020-03-29 10:52:23.861 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/zone/update  
            2020-03-29 10:52:23.974 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : PUT Zone(id=555, description=CENTRO-EDIT)  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            update  
            zone  
            set  
            description=?  
            where  
            id=?  
            2020-03-29 10:52:23.981 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/zone/listAll  
            2020-03-29 10:52:24.093 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ALL FROM -> com.cafeto.challenge.zone.service.ZoneServiceHandler  
            Hibernate:  
            select  
            zone0_.id as id1_7_,  
            zone0_.description as descript2_7_  
            from  
            zone zone0_  
            Hibernate:  
            select  
            zone0_.id as id1_7_,  
            zone0_.description as descript2_7_  
            from  
            zone zone0_  
            2020-03-29 10:52:24.101 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/zone/556  
            2020-03-29 10:52:24.200 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ONE FROM -> com.cafeto.challenge.zone.service.ZoneServiceHandler WITH ID=556  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_,  
            zone0_.description as descript2_7_  
            from  
            zone zone0_  
            2020-03-29 10:52:24.209 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/zone/delete  
            2020-03-29 10:52:24.304 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : DELETE ONE OF -> com.cafeto.challenge.zone.service.ZoneServiceHandler WITH ID=556  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            delete  
            from  
            zone  
            where  
            id=?  
            </span>
*   <span>_

    <div class="time">704 ms</div>

    _CityTest</span>
    *   <span>_

        <div class="time">704 ms</div>

        __passed_CityTest.runAllCases</span>
        *   <span class="stdout">Hibernate:  
            select  
            zone0_.id as id1_7_,  
            zone0_.description as descript2_7_  
            from  
            zone zone0_  
            2020-03-29 10:52:24.339 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/city/create  
            2020-03-29 10:52:24.440 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST City(id=null, description=BOGOTA, zone=Zone(id=557, description=NORTE))  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            city  
            (description, zone_id, id)  
            values  
            (?, ?, ?)  
            2020-03-29 10:52:24.448 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/city/create  
            2020-03-29 10:52:24.554 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST City(id=null, description=CALI, zone=Zone(id=558, description=SUR))  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            city  
            (description, zone_id, id)  
            values  
            (?, ?, ?)  
            2020-03-29 10:52:24.559 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/city/create  
            2020-03-29 10:52:24.646 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST City(id=null, description=MEDELLIN, zone=Zone(id=555, description=CENTRO-EDIT))  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            city  
            (description, zone_id, id)  
            values  
            (?, ?, ?)  
            Hibernate:  
            select  
            city0_.id as id1_0_,  
            city0_.description as descript2_0_,  
            city0_.zone_id as zone_id3_0_  
            from  
            city city0_  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            2020-03-29 10:52:24.657 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/city/update  
            2020-03-29 10:52:24.742 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : PUT City(id=559, description=CENTRO-EDIT, zone=Zone(id=557, description=NORTE))  
            Hibernate:  
            select  
            city0_.id as id1_0_1_,  
            city0_.description as descript2_0_1_,  
            city0_.zone_id as zone_id3_0_1_,  
            zone1_.id as id1_7_0_,  
            zone1_.description as descript2_7_0_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            update  
            city  
            set  
            description=?,  
            zone_id=?  
            where  
            id=?  
            2020-03-29 10:52:24.748 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/city/listAll  
            2020-03-29 10:52:24.830 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ALL FROM -> com.cafeto.challenge.city.service.CityServiceHandler  
            Hibernate:  
            select  
            city0_.id as id1_0_,  
            city0_.description as descript2_0_,  
            city0_.zone_id as zone_id3_0_  
            from  
            city city0_  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            city0_.id as id1_0_,  
            city0_.description as descript2_0_,  
            city0_.zone_id as zone_id3_0_  
            from  
            city city0_  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            2020-03-29 10:52:24.842 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/city/560  
            2020-03-29 10:52:24.927 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ONE FROM -> com.cafeto.challenge.city.service.CityServiceHandler WITH ID=560  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            city0_.id as id1_0_,  
            city0_.description as descript2_0_,  
            city0_.zone_id as zone_id3_0_  
            from  
            city city0_  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            2020-03-29 10:52:24.938 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/city/delete  
            2020-03-29 10:52:25.022 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : DELETE ONE OF -> com.cafeto.challenge.city.service.CityServiceHandler WITH ID=560  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            delete  
            from  
            city  
            where  
            id=?  
            </span>
*   <span>_

    <div class="time">738 ms</div>

    _ClinicTypeTest</span>
    *   <span>_

        <div class="time">738 ms</div>

        __passed_ClinicTypeTest.runAllCases</span>
        *   <span class="stdout">2020-03-29 10:52:25.044 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic-type/create  
            2020-03-29 10:52:25.138 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST ClinicType(id=null, description=DIÁLISIS PERITONEA)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            clinic_type  
            (description, id)  
            values  
            (?, ?)  
            2020-03-29 10:52:25.145 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic-type/create  
            2020-03-29 10:52:25.229 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST ClinicType(id=null, description=HEMODIÁLISIS)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            clinic_type  
            (description, id)  
            values  
            (?, ?)  
            2020-03-29 10:52:25.234 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic-type/create  
            2020-03-29 10:52:25.318 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST ClinicType(id=null, description=NEFROLOGÍA GENERAL)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            clinic_type  
            (description, id)  
            values  
            (?, ?)  
            2020-03-29 10:52:25.324 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic-type/create  
            2020-03-29 10:52:25.407 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST ClinicType(id=null, description=ENFERMEDADES SISTÉMICAS Y AUTOINMUNES)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            clinic_type  
            (description, id)  
            values  
            (?, ?)  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_,  
            clinictype0_.description as descript2_2_  
            from  
            clinic_type clinictype0_  
            2020-03-29 10:52:25.415 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic-type/update  
            2020-03-29 10:52:25.498 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : PUT ClinicType(id=562, description=DIÁLISIS PERITONEA - EDIT)  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            update  
            clinic_type  
            set  
            description=?  
            where  
            id=?  
            2020-03-29 10:52:25.504 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic-type/listAll  
            2020-03-29 10:52:25.588 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ALL FROM -> com.cafeto.challenge.clinicType.service.ClinicTypeServiceHandler  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_,  
            clinictype0_.description as descript2_2_  
            from  
            clinic_type clinictype0_  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_,  
            clinictype0_.description as descript2_2_  
            from  
            clinic_type clinictype0_  
            2020-03-29 10:52:25.597 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic-type/563  
            2020-03-29 10:52:25.682 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ONE FROM -> com.cafeto.challenge.clinicType.service.ClinicTypeServiceHandler WITH ID=563  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_,  
            clinictype0_.description as descript2_2_  
            from  
            clinic_type clinictype0_  
            2020-03-29 10:52:25.691 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic-type/delete  
            2020-03-29 10:52:25.773 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : DELETE ONE OF -> com.cafeto.challenge.clinicType.service.ClinicTypeServiceHandler WITH ID=563  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            delete  
            from  
            clinic_type  
            where  
            id=?  
            </span>
*   <span>_

    <div class="time">593 ms</div>

    _ClinicTest</span>
    *   <span>_

        <div class="time">593 ms</div>

        __passed_ClinicTest.runAllCases</span>
        *   <span class="stdout">Hibernate:  
            select  
            clinic0_.id as id1_1_,  
            clinic0_.administrator as administ2_1_,  
            clinic0_.capacity as capacity3_1_,  
            clinic0_.city_id as city_id7_1_,  
            clinic0_.clinic_type_id as clinic_t8_1_,  
            clinic0_.director as director4_1_,  
            clinic0_.email as email5_1_,  
            clinic0_.name as name6_1_  
            from  
            clinic clinic0_  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_,  
            clinictype0_.description as descript2_2_  
            from  
            clinic_type clinictype0_  
            Hibernate:  
            select  
            city0_.id as id1_0_,  
            city0_.description as descript2_0_,  
            city0_.zone_id as zone_id3_0_  
            from  
            city city0_  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            Hibernate:  
            select  
            zone0_.id as id1_7_0_,  
            zone0_.description as descript2_7_0_  
            from  
            zone zone0_  
            where  
            zone0_.id=?  
            2020-03-29 10:52:25.799 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic/create  
            2020-03-29 10:52:25.889 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST Clinic(id=null, name=USA Nephrology Specialists, administrator=Dr. Shanne Velovsky, email=USA-Nephrology-Specialists@USANS.com, director=Dr. Marck Beckner, city=City(id=561, description=MEDELLIN, zone=Zone(id=555, description=CENTRO-EDIT)), capacity=3000, clinicType=ClinicType(id=564, description=NEFROLOGÍA GENERAL))  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            clinic  
            (administrator, capacity, city_id, clinic_type_id, director, email, name, id)  
            values  
            (?, ?, ?, ?, ?, ?, ?, ?)  
            2020-03-29 10:52:25.901 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic/create  
            2020-03-29 10:52:25.984 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST Clinic(id=null, name=Johns Hopkins Hospital, administrator=Dr. James H. Black, MD, email=EEOconcerns@jhmi.edu, director=Dr. Christopher J. Abularrage, MD, city=City(id=559, description=CENTRO-EDIT, zone=Zone(id=557, description=NORTE)), capacity=6000, clinicType=ClinicType(id=565, description=ENFERMEDADES SISTÉMICAS Y AUTOINMUNES))  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            clinic  
            (administrator, capacity, city_id, clinic_type_id, director, email, name, id)  
            values  
            (?, ?, ?, ?, ?, ?, ?, ?)  
            Hibernate:  
            select  
            clinic0_.id as id1_1_,  
            clinic0_.administrator as administ2_1_,  
            clinic0_.capacity as capacity3_1_,  
            clinic0_.city_id as city_id7_1_,  
            clinic0_.clinic_type_id as clinic_t8_1_,  
            clinic0_.director as director4_1_,  
            clinic0_.email as email5_1_,  
            clinic0_.name as name6_1_  
            from  
            clinic clinic0_  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            2020-03-29 10:52:25.998 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic/update  
            2020-03-29 10:52:26.084 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : PUT Clinic(id=566, name=USA Nephrology Specialists - EDIT, administrator=Dr. Shanne Velovsky, email=USA-Nephrology-Specialists@USANS.com, director=Dr. Marck Beckner, city=City(id=561, description=MEDELLIN, zone=Zone(id=555, description=CENTRO-EDIT)), capacity=3000, clinicType=ClinicType(id=564, description=NEFROLOGÍA GENERAL))  
            Hibernate:  
            select  
            clinic0_.id as id1_1_3_,  
            clinic0_.administrator as administ2_1_3_,  
            clinic0_.capacity as capacity3_1_3_,  
            clinic0_.city_id as city_id7_1_3_,  
            clinic0_.clinic_type_id as clinic_t8_1_3_,  
            clinic0_.director as director4_1_3_,  
            clinic0_.email as email5_1_3_,  
            clinic0_.name as name6_1_3_,  
            city1_.id as id1_0_0_,  
            city1_.description as descript2_0_0_,  
            city1_.zone_id as zone_id3_0_0_,  
            zone2_.id as id1_7_1_,  
            zone2_.description as descript2_7_1_,  
            clinictype3_.id as id1_2_2_,  
            clinictype3_.description as descript2_2_2_  
            from  
            clinic clinic0_  
            left outer join  
            city city1_  
            on clinic0_.city_id=city1_.id  
            left outer join  
            zone zone2_  
            on city1_.zone_id=zone2_.id  
            left outer join  
            clinic_type clinictype3_  
            on clinic0_.clinic_type_id=clinictype3_.id  
            where  
            clinic0_.id=?  
            Hibernate:  
            update  
            clinic  
            set  
            administrator=?,  
            capacity=?,  
            city_id=?,  
            clinic_type_id=?,  
            director=?,  
            email=?,  
            name=?  
            where  
            id=?  
            2020-03-29 10:52:26.091 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic/listAll  
            2020-03-29 10:52:26.176 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ALL FROM -> com.cafeto.challenge.clinic.service.ClinicServiceHandler  
            Hibernate:  
            select  
            clinic0_.id as id1_1_,  
            clinic0_.administrator as administ2_1_,  
            clinic0_.capacity as capacity3_1_,  
            clinic0_.city_id as city_id7_1_,  
            clinic0_.clinic_type_id as clinic_t8_1_,  
            clinic0_.director as director4_1_,  
            clinic0_.email as email5_1_,  
            clinic0_.name as name6_1_  
            from  
            clinic clinic0_  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            select  
            clinic0_.id as id1_1_,  
            clinic0_.administrator as administ2_1_,  
            clinic0_.capacity as capacity3_1_,  
            clinic0_.city_id as city_id7_1_,  
            clinic0_.clinic_type_id as clinic_t8_1_,  
            clinic0_.director as director4_1_,  
            clinic0_.email as email5_1_,  
            clinic0_.name as name6_1_  
            from  
            clinic clinic0_  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            2020-03-29 10:52:26.190 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic/567  
            2020-03-29 10:52:26.272 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ONE FROM -> com.cafeto.challenge.clinic.service.ClinicServiceHandler WITH ID=567  
            Hibernate:  
            select  
            clinic0_.id as id1_1_0_,  
            clinic0_.administrator as administ2_1_0_,  
            clinic0_.capacity as capacity3_1_0_,  
            clinic0_.city_id as city_id7_1_0_,  
            clinic0_.clinic_type_id as clinic_t8_1_0_,  
            clinic0_.director as director4_1_0_,  
            clinic0_.email as email5_1_0_,  
            clinic0_.name as name6_1_0_,  
            city1_.id as id1_0_1_,  
            city1_.description as descript2_0_1_,  
            city1_.zone_id as zone_id3_0_1_,  
            zone2_.id as id1_7_2_,  
            zone2_.description as descript2_7_2_,  
            clinictype3_.id as id1_2_3_,  
            clinictype3_.description as descript2_2_3_  
            from  
            clinic clinic0_  
            left outer join  
            city city1_  
            on clinic0_.city_id=city1_.id  
            left outer join  
            zone zone2_  
            on city1_.zone_id=zone2_.id  
            left outer join  
            clinic_type clinictype3_  
            on clinic0_.clinic_type_id=clinictype3_.id  
            where  
            clinic0_.id=?  
            Hibernate:  
            select  
            clinic0_.id as id1_1_,  
            clinic0_.administrator as administ2_1_,  
            clinic0_.capacity as capacity3_1_,  
            clinic0_.city_id as city_id7_1_,  
            clinic0_.clinic_type_id as clinic_t8_1_,  
            clinic0_.director as director4_1_,  
            clinic0_.email as email5_1_,  
            clinic0_.name as name6_1_  
            from  
            clinic clinic0_  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            2020-03-29 10:52:26.285 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/clinic/delete  
            2020-03-29 10:52:26.371 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : DELETE ONE OF -> com.cafeto.challenge.clinic.service.ClinicServiceHandler WITH ID=567  
            Hibernate:  
            select  
            clinic0_.id as id1_1_0_,  
            clinic0_.administrator as administ2_1_0_,  
            clinic0_.capacity as capacity3_1_0_,  
            clinic0_.city_id as city_id7_1_0_,  
            clinic0_.clinic_type_id as clinic_t8_1_0_,  
            clinic0_.director as director4_1_0_,  
            clinic0_.email as email5_1_0_,  
            clinic0_.name as name6_1_0_,  
            city1_.id as id1_0_1_,  
            city1_.description as descript2_0_1_,  
            city1_.zone_id as zone_id3_0_1_,  
            zone2_.id as id1_7_2_,  
            zone2_.description as descript2_7_2_,  
            clinictype3_.id as id1_2_3_,  
            clinictype3_.description as descript2_2_3_  
            from  
            clinic clinic0_  
            left outer join  
            city city1_  
            on clinic0_.city_id=city1_.id  
            left outer join  
            zone zone2_  
            on city1_.zone_id=zone2_.id  
            left outer join  
            clinic_type clinictype3_  
            on clinic0_.clinic_type_id=clinictype3_.id  
            where  
            clinic0_.id=?  
            Hibernate:  
            delete  
            from  
            clinic  
            where  
            id=?  
            </span>
*   <span>_

    <div class="time">680 ms</div>

    _NephrologistBaseClinicTest</span>
    *   <span>_

        <div class="time">680 ms</div>

        __passed_NephrologistBaseClinicTest.runAllCases</span>
        *   <span class="stdout">Hibernate:  
            select  
            clinic0_.id as id1_1_,  
            clinic0_.administrator as administ2_1_,  
            clinic0_.capacity as capacity3_1_,  
            clinic0_.city_id as city_id7_1_,  
            clinic0_.clinic_type_id as clinic_t8_1_,  
            clinic0_.director as director4_1_,  
            clinic0_.email as email5_1_,  
            clinic0_.name as name6_1_  
            from  
            clinic clinic0_  
            Hibernate:  
            select  
            city0_.id as id1_0_0_,  
            city0_.description as descript2_0_0_,  
            city0_.zone_id as zone_id3_0_0_,  
            zone1_.id as id1_7_1_,  
            zone1_.description as descript2_7_1_  
            from  
            city city0_  
            left outer join  
            zone zone1_  
            on city0_.zone_id=zone1_.id  
            where  
            city0_.id=?  
            Hibernate:  
            select  
            clinictype0_.id as id1_2_0_,  
            clinictype0_.description as descript2_2_0_  
            from  
            clinic_type clinictype0_  
            where  
            clinictype0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_,  
            nephrologi0_.active as active2_3_,  
            nephrologi0_.email as email3_3_,  
            nephrologi0_.name as name4_3_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_  
            from  
            nephrologist nephrologi0_  
            Hibernate:  
            select  
            nephrologi0_.id as id1_5_0_,  
            nephrologi0_.description as descript2_5_0_  
            from  
            nephrologist_type nephrologi0_  
            where  
            nephrologi0_.id=?  
            2020-03-29 10:52:26.407 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-base-clinic/create  
            2020-03-29 10:52:26.523 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST NephrologistBaseClinic(id=null, nephrologist=Nephrologist(id=554, name=Dr. Jhon S. Jhon, MD, nephrologistType=NephrologistType(id=550, description=Glomerular conditions, such as glomerulonephritis and nephrotic syndrome), email=jhon2two@gmail.com, active=true), clinic=Clinic(id=566, name=USA Nephrology Specialists - EDIT, administrator=Dr. Shanne Velovsky, email=USA-Nephrology-Specialists@USANS.com, director=Dr. Marck Beckner, city=City(id=561, description=MEDELLIN, zone=Zone(id=555, description=CENTRO-EDIT)), capacity=3000, clinicType=ClinicType(id=564, description=NEFROLOGÍA GENERAL)), salary=7500, dedicationHours=48.0)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            nephrologist_base_clinic  
            (clinic_id, dedication_hours, nephrologist_id, salary, id)  
            values  
            (?, ?, ?, ?, ?)  
            2020-03-29 10:52:26.537 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-base-clinic/create  
            2020-03-29 10:52:26.647 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : POST NephrologistBaseClinic(id=null, nephrologist=Nephrologist(id=554, name=Dr. Jhon S. Jhon, MD, nephrologistType=NephrologistType(id=550, description=Glomerular conditions, such as glomerulonephritis and nephrotic syndrome), email=jhon2two@gmail.com, active=true), clinic=Clinic(id=566, name=USA Nephrology Specialists - EDIT, administrator=Dr. Shanne Velovsky, email=USA-Nephrology-Specialists@USANS.com, director=Dr. Marck Beckner, city=City(id=561, description=MEDELLIN, zone=Zone(id=555, description=CENTRO-EDIT)), capacity=3000, clinicType=ClinicType(id=564, description=NEFROLOGÍA GENERAL)), salary=7500, dedicationHours=32.0)  
            Hibernate:  
            select  
            nextval ('hibernate_sequence')  
            Hibernate:  
            insert  
            into  
            nephrologist_base_clinic  
            (clinic_id, dedication_hours, nephrologist_id, salary, id)  
            values  
            (?, ?, ?, ?, ?)  
            Hibernate:  
            select  
            nephrologi0_.id as id1_4_,  
            nephrologi0_.clinic_id as clinic_i4_4_,  
            nephrologi0_.dedication_hours as dedicati2_4_,  
            nephrologi0_.nephrologist_id as nephrolo5_4_,  
            nephrologi0_.salary as salary3_4_  
            from  
            nephrologist_base_clinic nephrologi0_  
            Hibernate:  
            select  
            clinic0_.id as id1_1_0_,  
            clinic0_.administrator as administ2_1_0_,  
            clinic0_.capacity as capacity3_1_0_,  
            clinic0_.city_id as city_id7_1_0_,  
            clinic0_.clinic_type_id as clinic_t8_1_0_,  
            clinic0_.director as director4_1_0_,  
            clinic0_.email as email5_1_0_,  
            clinic0_.name as name6_1_0_,  
            city1_.id as id1_0_1_,  
            city1_.description as descript2_0_1_,  
            city1_.zone_id as zone_id3_0_1_,  
            zone2_.id as id1_7_2_,  
            zone2_.description as descript2_7_2_,  
            clinictype3_.id as id1_2_3_,  
            clinictype3_.description as descript2_2_3_  
            from  
            clinic clinic0_  
            left outer join  
            city city1_  
            on clinic0_.city_id=city1_.id  
            left outer join  
            zone zone2_  
            on city1_.zone_id=zone2_.id  
            left outer join  
            clinic_type clinictype3_  
            on clinic0_.clinic_type_id=clinictype3_.id  
            where  
            clinic0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_0_,  
            nephrologi0_.active as active2_3_0_,  
            nephrologi0_.email as email3_3_0_,  
            nephrologi0_.name as name4_3_0_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_0_,  
            nephrologi1_.id as id1_5_1_,  
            nephrologi1_.description as descript2_5_1_  
            from  
            nephrologist nephrologi0_  
            left outer join  
            nephrologist_type nephrologi1_  
            on nephrologi0_.nephrologist_type_id=nephrologi1_.id  
            where  
            nephrologi0_.id=?  
            2020-03-29 10:52:26.661 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-base-clinic/update  
            2020-03-29 10:52:26.771 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : PUT NephrologistBaseClinic(id=568, nephrologist=Nephrologist(id=554, name=Dr. Jhon S. Jhon, MD, nephrologistType=NephrologistType(id=550, description=Glomerular conditions, such as glomerulonephritis and nephrotic syndrome), email=jhon2two@gmail.com, active=true), clinic=Clinic(id=566, name=USA Nephrology Specialists - EDIT, administrator=Dr. Shanne Velovsky, email=USA-Nephrology-Specialists@USANS.com, director=Dr. Marck Beckner, city=City(id=561, description=MEDELLIN, zone=Zone(id=555, description=CENTRO-EDIT)), capacity=3000, clinicType=ClinicType(id=564, description=NEFROLOGÍA GENERAL)), salary=7500.00, dedicationHours=64.0)  
            Hibernate:  
            select  
            nephrologi0_.id as id1_4_6_,  
            nephrologi0_.clinic_id as clinic_i4_4_6_,  
            nephrologi0_.dedication_hours as dedicati2_4_6_,  
            nephrologi0_.nephrologist_id as nephrolo5_4_6_,  
            nephrologi0_.salary as salary3_4_6_,  
            clinic1_.id as id1_1_0_,  
            clinic1_.administrator as administ2_1_0_,  
            clinic1_.capacity as capacity3_1_0_,  
            clinic1_.city_id as city_id7_1_0_,  
            clinic1_.clinic_type_id as clinic_t8_1_0_,  
            clinic1_.director as director4_1_0_,  
            clinic1_.email as email5_1_0_,  
            clinic1_.name as name6_1_0_,  
            city2_.id as id1_0_1_,  
            city2_.description as descript2_0_1_,  
            city2_.zone_id as zone_id3_0_1_,  
            zone3_.id as id1_7_2_,  
            zone3_.description as descript2_7_2_,  
            clinictype4_.id as id1_2_3_,  
            clinictype4_.description as descript2_2_3_,  
            nephrologi5_.id as id1_3_4_,  
            nephrologi5_.active as active2_3_4_,  
            nephrologi5_.email as email3_3_4_,  
            nephrologi5_.name as name4_3_4_,  
            nephrologi5_.nephrologist_type_id as nephrolo5_3_4_,  
            nephrologi6_.id as id1_5_5_,  
            nephrologi6_.description as descript2_5_5_  
            from  
            nephrologist_base_clinic nephrologi0_  
            left outer join  
            clinic clinic1_  
            on nephrologi0_.clinic_id=clinic1_.id  
            left outer join  
            city city2_  
            on clinic1_.city_id=city2_.id  
            left outer join  
            zone zone3_  
            on city2_.zone_id=zone3_.id  
            left outer join  
            clinic_type clinictype4_  
            on clinic1_.clinic_type_id=clinictype4_.id  
            left outer join  
            nephrologist nephrologi5_  
            on nephrologi0_.nephrologist_id=nephrologi5_.id  
            left outer join  
            nephrologist_type nephrologi6_  
            on nephrologi5_.nephrologist_type_id=nephrologi6_.id  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            update  
            nephrologist_base_clinic  
            set  
            clinic_id=?,  
            dedication_hours=?,  
            nephrologist_id=?,  
            salary=?  
            where  
            id=?  
            2020-03-29 10:52:26.780 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-base-clinic/listAll  
            2020-03-29 10:52:26.865 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ALL FROM -> com.cafeto.challenge.nephrologistBaseClinic.service.NephrologistBaseClinicServiceHandler  
            Hibernate:  
            select  
            nephrologi0_.id as id1_4_,  
            nephrologi0_.clinic_id as clinic_i4_4_,  
            nephrologi0_.dedication_hours as dedicati2_4_,  
            nephrologi0_.nephrologist_id as nephrolo5_4_,  
            nephrologi0_.salary as salary3_4_  
            from  
            nephrologist_base_clinic nephrologi0_  
            Hibernate:  
            select  
            clinic0_.id as id1_1_0_,  
            clinic0_.administrator as administ2_1_0_,  
            clinic0_.capacity as capacity3_1_0_,  
            clinic0_.city_id as city_id7_1_0_,  
            clinic0_.clinic_type_id as clinic_t8_1_0_,  
            clinic0_.director as director4_1_0_,  
            clinic0_.email as email5_1_0_,  
            clinic0_.name as name6_1_0_,  
            city1_.id as id1_0_1_,  
            city1_.description as descript2_0_1_,  
            city1_.zone_id as zone_id3_0_1_,  
            zone2_.id as id1_7_2_,  
            zone2_.description as descript2_7_2_,  
            clinictype3_.id as id1_2_3_,  
            clinictype3_.description as descript2_2_3_  
            from  
            clinic clinic0_  
            left outer join  
            city city1_  
            on clinic0_.city_id=city1_.id  
            left outer join  
            zone zone2_  
            on city1_.zone_id=zone2_.id  
            left outer join  
            clinic_type clinictype3_  
            on clinic0_.clinic_type_id=clinictype3_.id  
            where  
            clinic0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_0_,  
            nephrologi0_.active as active2_3_0_,  
            nephrologi0_.email as email3_3_0_,  
            nephrologi0_.name as name4_3_0_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_0_,  
            nephrologi1_.id as id1_5_1_,  
            nephrologi1_.description as descript2_5_1_  
            from  
            nephrologist nephrologi0_  
            left outer join  
            nephrologist_type nephrologi1_  
            on nephrologi0_.nephrologist_type_id=nephrologi1_.id  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_4_,  
            nephrologi0_.clinic_id as clinic_i4_4_,  
            nephrologi0_.dedication_hours as dedicati2_4_,  
            nephrologi0_.nephrologist_id as nephrolo5_4_,  
            nephrologi0_.salary as salary3_4_  
            from  
            nephrologist_base_clinic nephrologi0_  
            Hibernate:  
            select  
            clinic0_.id as id1_1_0_,  
            clinic0_.administrator as administ2_1_0_,  
            clinic0_.capacity as capacity3_1_0_,  
            clinic0_.city_id as city_id7_1_0_,  
            clinic0_.clinic_type_id as clinic_t8_1_0_,  
            clinic0_.director as director4_1_0_,  
            clinic0_.email as email5_1_0_,  
            clinic0_.name as name6_1_0_,  
            city1_.id as id1_0_1_,  
            city1_.description as descript2_0_1_,  
            city1_.zone_id as zone_id3_0_1_,  
            zone2_.id as id1_7_2_,  
            zone2_.description as descript2_7_2_,  
            clinictype3_.id as id1_2_3_,  
            clinictype3_.description as descript2_2_3_  
            from  
            clinic clinic0_  
            left outer join  
            city city1_  
            on clinic0_.city_id=city1_.id  
            left outer join  
            zone zone2_  
            on city1_.zone_id=zone2_.id  
            left outer join  
            clinic_type clinictype3_  
            on clinic0_.clinic_type_id=clinictype3_.id  
            where  
            clinic0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_0_,  
            nephrologi0_.active as active2_3_0_,  
            nephrologi0_.email as email3_3_0_,  
            nephrologi0_.name as name4_3_0_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_0_,  
            nephrologi1_.id as id1_5_1_,  
            nephrologi1_.description as descript2_5_1_  
            from  
            nephrologist nephrologi0_  
            left outer join  
            nephrologist_type nephrologi1_  
            on nephrologi0_.nephrologist_type_id=nephrologi1_.id  
            where  
            nephrologi0_.id=?  
            2020-03-29 10:52:26.877 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-base-clinic/569  
            2020-03-29 10:52:26.961 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : GET ONE FROM -> com.cafeto.challenge.nephrologistBaseClinic.service.NephrologistBaseClinicServiceHandler WITH ID=569  
            Hibernate:  
            select  
            nephrologi0_.id as id1_4_0_,  
            nephrologi0_.clinic_id as clinic_i4_4_0_,  
            nephrologi0_.dedication_hours as dedicati2_4_0_,  
            nephrologi0_.nephrologist_id as nephrolo5_4_0_,  
            nephrologi0_.salary as salary3_4_0_,  
            clinic1_.id as id1_1_1_,  
            clinic1_.administrator as administ2_1_1_,  
            clinic1_.capacity as capacity3_1_1_,  
            clinic1_.city_id as city_id7_1_1_,  
            clinic1_.clinic_type_id as clinic_t8_1_1_,  
            clinic1_.director as director4_1_1_,  
            clinic1_.email as email5_1_1_,  
            clinic1_.name as name6_1_1_,  
            city2_.id as id1_0_2_,  
            city2_.description as descript2_0_2_,  
            city2_.zone_id as zone_id3_0_2_,  
            zone3_.id as id1_7_3_,  
            zone3_.description as descript2_7_3_,  
            clinictype4_.id as id1_2_4_,  
            clinictype4_.description as descript2_2_4_,  
            nephrologi5_.id as id1_3_5_,  
            nephrologi5_.active as active2_3_5_,  
            nephrologi5_.email as email3_3_5_,  
            nephrologi5_.name as name4_3_5_,  
            nephrologi5_.nephrologist_type_id as nephrolo5_3_5_,  
            nephrologi6_.id as id1_5_6_,  
            nephrologi6_.description as descript2_5_6_  
            from  
            nephrologist_base_clinic nephrologi0_  
            left outer join  
            clinic clinic1_  
            on nephrologi0_.clinic_id=clinic1_.id  
            left outer join  
            city city2_  
            on clinic1_.city_id=city2_.id  
            left outer join  
            zone zone3_  
            on city2_.zone_id=zone3_.id  
            left outer join  
            clinic_type clinictype4_  
            on clinic1_.clinic_type_id=clinictype4_.id  
            left outer join  
            nephrologist nephrologi5_  
            on nephrologi0_.nephrologist_id=nephrologi5_.id  
            left outer join  
            nephrologist_type nephrologi6_  
            on nephrologi5_.nephrologist_type_id=nephrologi6_.id  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_4_,  
            nephrologi0_.clinic_id as clinic_i4_4_,  
            nephrologi0_.dedication_hours as dedicati2_4_,  
            nephrologi0_.nephrologist_id as nephrolo5_4_,  
            nephrologi0_.salary as salary3_4_  
            from  
            nephrologist_base_clinic nephrologi0_  
            Hibernate:  
            select  
            clinic0_.id as id1_1_0_,  
            clinic0_.administrator as administ2_1_0_,  
            clinic0_.capacity as capacity3_1_0_,  
            clinic0_.city_id as city_id7_1_0_,  
            clinic0_.clinic_type_id as clinic_t8_1_0_,  
            clinic0_.director as director4_1_0_,  
            clinic0_.email as email5_1_0_,  
            clinic0_.name as name6_1_0_,  
            city1_.id as id1_0_1_,  
            city1_.description as descript2_0_1_,  
            city1_.zone_id as zone_id3_0_1_,  
            zone2_.id as id1_7_2_,  
            zone2_.description as descript2_7_2_,  
            clinictype3_.id as id1_2_3_,  
            clinictype3_.description as descript2_2_3_  
            from  
            clinic clinic0_  
            left outer join  
            city city1_  
            on clinic0_.city_id=city1_.id  
            left outer join  
            zone zone2_  
            on city1_.zone_id=zone2_.id  
            left outer join  
            clinic_type clinictype3_  
            on clinic0_.clinic_type_id=clinictype3_.id  
            where  
            clinic0_.id=?  
            Hibernate:  
            select  
            nephrologi0_.id as id1_3_0_,  
            nephrologi0_.active as active2_3_0_,  
            nephrologi0_.email as email3_3_0_,  
            nephrologi0_.name as name4_3_0_,  
            nephrologi0_.nephrologist_type_id as nephrolo5_3_0_,  
            nephrologi1_.id as id1_5_1_,  
            nephrologi1_.description as descript2_5_1_  
            from  
            nephrologist nephrologi0_  
            left outer join  
            nephrologist_type nephrologi1_  
            on nephrologi0_.nephrologist_type_id=nephrologi1_.id  
            where  
            nephrologi0_.id=?  
            2020-03-29 10:52:26.973 INFO 5340 --- [ main] c.c.c.a.s.JwtRequestFilter : INTERCEPT URL /api/v1/s1/nephrologist-base-clinic/delete  
            2020-03-29 10:52:27.061 INFO 5340 --- [ main] c.c.c.a.c.ControllerBase : DELETE ONE OF -> com.cafeto.challenge.nephrologistBaseClinic.service.NephrologistBaseClinicServiceHandler WITH ID=569  
            Hibernate:  
            select  
            nephrologi0_.id as id1_4_0_,  
            nephrologi0_.clinic_id as clinic_i4_4_0_,  
            nephrologi0_.dedication_hours as dedicati2_4_0_,  
            nephrologi0_.nephrologist_id as nephrolo5_4_0_,  
            nephrologi0_.salary as salary3_4_0_,  
            clinic1_.id as id1_1_1_,  
            clinic1_.administrator as administ2_1_1_,  
            clinic1_.capacity as capacity3_1_1_,  
            clinic1_.city_id as city_id7_1_1_,  
            clinic1_.clinic_type_id as clinic_t8_1_1_,  
            clinic1_.director as director4_1_1_,  
            clinic1_.email as email5_1_1_,  
            clinic1_.name as name6_1_1_,  
            city2_.id as id1_0_2_,  
            city2_.description as descript2_0_2_,  
            city2_.zone_id as zone_id3_0_2_,  
            zone3_.id as id1_7_3_,  
            zone3_.description as descript2_7_3_,  
            clinictype4_.id as id1_2_4_,  
            clinictype4_.description as descript2_2_4_,  
            nephrologi5_.id as id1_3_5_,  
            nephrologi5_.active as active2_3_5_,  
            nephrologi5_.email as email3_3_5_,  
            nephrologi5_.name as name4_3_5_,  
            nephrologi5_.nephrologist_type_id as nephrolo5_3_5_,  
            nephrologi6_.id as id1_5_6_,  
            nephrologi6_.description as descript2_5_6_  
            from  
            nephrologist_base_clinic nephrologi0_  
            left outer join  
            clinic clinic1_  
            on nephrologi0_.clinic_id=clinic1_.id  
            left outer join  
            city city2_  
            on clinic1_.city_id=city2_.id  
            left outer join  
            zone zone3_  
            on city2_.zone_id=zone3_.id  
            left outer join  
            clinic_type clinictype4_  
            on clinic1_.clinic_type_id=clinictype4_.id  
            left outer join  
            nephrologist nephrologi5_  
            on nephrologi0_.nephrologist_id=nephrologi5_.id  
            left outer join  
            nephrologist_type nephrologi6_  
            on nephrologi5_.nephrologist_type_id=nephrologi6_.id  
            where  
            nephrologi0_.id=?  
            Hibernate:  
            delete  
            from  
            nephrologist_base_clinic  
            where  
            id=?  
            </span>

</div>

</div>

<div id="footer">

Generated by IntelliJ IDEA on 3/29/20 10:53 AM

</div>
