/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;

/**
 *
 * @author Bishal
 */
public class Customer {
    int id;
    String name;
    ArrayList<String> carList = new ArrayList<String>();

    public Customer(int id, String name, ArrayList<String> carList) {
        this.id = id;
        this.name = name;
        this.carList = carList;
    }

    public Customer() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarList(ArrayList<String> carList) {
        this.carList = carList;
    }
    private void addCustomer(String cust_id, String cust_name, ArrayList<String> cust_car_List)
    {

    }
    
}
