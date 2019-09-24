/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bishal
 */
public class Customer_Login {
    String  userName;
    ArrayList<String> userCarList = new ArrayList<String>();
    int userId,i;
    Scanner obj = new Scanner(System.in);

    public Customer_Login(int id, String name, ArrayList<String> carList) {
        userId = id;
        userName = name;
        userCarList = carList;
        System.out.print("Welcome " + name + "\n");
        System.out.print("If you want to see your details then press 1 or press any other number to exit the program");
        i = obj.nextInt();
        if (i == 1) {
            System.out.println(userId);
            System.out.println(userName);
            for(String cars: userCarList)
            {
                System.out.println(cars);
            }
        } else {

        }
    }
    
}
