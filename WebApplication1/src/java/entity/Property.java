/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Михаил
 */
public class Property {
    private int property_id;
    private int adress_id;
    private String type;
    private int square; //в кв.м
    private int price; //в $
    private int seller_id;

    public int getProperty_id() {
        return property_id;
    }

    public void setProperty_id(int property_id) {
        this.property_id = property_id;
    }

    public int getAdress_id() {
        return adress_id;
    }

    public void setAdress_id(int adress_id) {
        this.adress_id = adress_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public Property(int property_id, int adress_id, String type, int square, int price, int seller_id) {
        this.property_id = property_id;
        this.adress_id = adress_id;
        this.type = type;
        this.square = square;
        this.price = price;
        this.seller_id = seller_id;
    }

    public Property(int adress_id, String type, int square, int price, int seller_id) {
        this.property_id = -1;
        this.adress_id = adress_id;
        this.type = type;
        this.square = square;
        this.price = price;
        this.seller_id = seller_id;
    }
    
    
    
}
