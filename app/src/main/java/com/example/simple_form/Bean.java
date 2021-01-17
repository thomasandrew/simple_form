package com.example.simple_form;

public class Bean {

    public static String ID = "ID";
    public static String NAME = "NAME";
    public static String LAST_NAME = "LAST_NAME";
    public static String STATE = "STATE";
    public static String CITY = "CITY";
    public static String ADDRESS = "ADDRESS";
    public static String TELEPHONE = "TELEPHONE";
    public static String CELLPHONE = "CELLPHONE";

    private int id;
    private String name;
    private String last_name;
    private String state;
    private String city;
    private String address;
    private int telephone;
    private int cellphone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }
}
