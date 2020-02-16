package com.st.market.stmarket.api;

/**
 *
 * @author janez
 */
public class Constants {

    public static final String API_VERSION = "/api/v1";
    public static final String URI_PRODUCT = API_VERSION + "/product";
    public static final String URI_USER = API_VERSION + "/user";
    public static final String URI_CART = API_VERSION + "/cart";
    public static final String URI_OPTIONS = API_VERSION + "/options";
    public static final String URI_ORDER = API_VERSION + "/order";
    
    public static final String HTTP_GET_ALL = "/listAll";
    public static final String HTTP_FILTER_BY = "/filterBy";
    public static final String HTTP_GET_ONE = "/findBy";
    public static final String HTTP_POST = "/create";
    public static final String HTTP_PUT = "/update";
    public static final String HTTP_DELETE = "/delete";
    public static final String HTTP_DELETE_OBJECT = "/deleteObject";
    
    public static final String HTTP_ADD_ITEM_CART = "/add-item";
    public static final String HTTP_GET_ITEMS_CART = "/get-items";
    public static final String HTTP_COUNT_ITEMS_CART = "/count-items";
    public static final String HTTP_REMOVE_ITEM_CART = "/remove-item";

    public static final String TOP_PRODUCTS = "/top-products";

    public static final String FIND_BY_USER_ID = "/findByUserId";
    public static final String FIND_PRODUCTS_BY_ORDER_ID = "/findProductsByOrderId";
}
