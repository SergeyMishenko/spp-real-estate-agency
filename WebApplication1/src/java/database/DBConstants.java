/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Михаил
 */
public class DBConstants {
    public static final String TABLE_USER_NAME = "user";
    public static final String TABLE_USER_ID_COLUMN = "id_user";
    public static final String TABLE_USER_LOGIN_COLUMN = "login";
    public static final String TABLE_USER_PASS_COLUMN = "password";
    public static final String TABLE_USER_NAME_COLUMN = "name";
    public static final String TABLE_USER_SURNAME_COLUMN = "surname";
    public static final String TABLE_USER_MID_NAME_COLUMN = "middle_name";
    public static final String TABLE_USER_PHONE_COLUMN = "phone_number";
    public static final String TABLE_USER_ROLE_COLUMN = "role";
    public static final String TABLE_USER_EMAIL_COLUMN = "email";
    public static final String TABLE_USER_ADRESS_ID_COLUMN = "id_adress";
    
    public static final String TABLE_ADRESS_NAME = "adress";
    public static final String TABLE_ADRESS_ID_COLUMN = "id_adress";
    public static final String TABLE_ADRESS_COUNTRY_COLUMN = "country";
    public static final String TABLE_ADRESS_CITY_COLUMN = "city";
    public static final String TABLE_ADRESS_STREET_COLUMN = "street";
    public static final String TABLE_ADRESS_HOUSE_COLUMN = "house_number";
    public static final String TABLE_ADRESS_HOUSING_COLUMN = "housing";
    public static final String TABLE_ADRESS_APARTMENT_COLUMN = "apartment";
    
    public static final String TABLE_PROPERTY_PROPERTY_ID_COLUMN = "id_property";
    public static final String TABLE_PROPERTY_NAME = "property";
    public static final String TABLE_PROPERTY_ADRESS_ID_COLUMN = "id_adress";
    public static final String TABLE_PROPERTY_TYPE_COLUMN = "type";
    public static final String TABLE_PROPERTY_SQUARE_COLUMN = "square";
    public static final String TABLE_PROPERTY_PRICE_COLUMN = "price";
    public static final String TABLE_PROPERTY_SELLER_ID_COLUMN = "id_seller";
}
