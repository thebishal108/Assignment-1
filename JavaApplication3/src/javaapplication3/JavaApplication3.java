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
public class JavaApplication3 {
   
public static ArrayList<Customer> customers =  new ArrayList<Customer>();

    public JavaApplication3(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int position, i=3,user_id=0;
        boolean admin_flag = false,customer_flag=false;
        ArrayList<String> admin_user_id = new ArrayList<String>();
        ArrayList<String> admin_password = new ArrayList<String>();
        String user_name = null, user_pass=null;
        admin_user_id.add("Bishal");
        admin_password.add("123");
        Scanner obj = new Scanner(System.in);
        do
        {
            i=3;
    System.out.println("Press 1 for admin login\nor\nPress 2 for User Login\nor\nPress 3 to exit the program");
    try {
                i = obj.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong Input");
            }
    
    if (i == 1) {
        System.out.println("Please enter the User Name");
        user_name = obj.next();
        System.out.println("Please enter the Password");
        user_pass = obj.next();
        for (String un : admin_user_id) {
            if (un.equals(user_name)) {
                position = admin_user_id.indexOf(un);
                if (user_pass.equals(admin_password.get(position))) {
                    Admin admin = new Admin(user_name,customers);
                    break;
                }
            } else {
                System.out.println("Sorry Admin User Id or Password does not match");
            }
        }
        
    } else if (i == 2) {
        System.out.println("Size"+customers.size());
        System.out.println("Please enter the User ID");
        user_id = obj.nextInt();
        for(Customer cust: customers)
                {
                    if (cust.id == user_id) {
                    Customer_Login customerlogin = new Customer_Login(cust.id,cust.name,cust.carList);
                }
            }
           }
        }while(i!=3);
            System.out.println("Bye have a Wonderfull Day");
    }
}
