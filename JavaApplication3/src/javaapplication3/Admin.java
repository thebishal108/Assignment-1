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
public class Admin {
    int i,custId;
    String User,custName="";
    ArrayList<Customer> customers =  new ArrayList<Customer>();
    ArrayList<String> customerCarList = new ArrayList<String>();
    Scanner obj = new Scanner(System.in);
    public Admin(String user, ArrayList<Customer> custom) {

        User = user;
        customers = custom;
        System.out.println("Welcome "+User+"\n");
        int a=4;
        do {
            i=4;
            System.out.println("What would you like do?\n");
            System.out.println("Press 1 if you want to see all the customer details");
            System.out.println("Press 2 if you want to add customer");
            System.out.println("Press 3 to if you want give away prizes to the customer");
            System.out.println("Press 4 to Log Out");
            try {
                i = obj.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong Input");
            }
            a=i;
            if(i==1)
            {
                for(Customer cust: this.customers)
                {
                    System.out.println(cust.id);
                    System.out.println(cust.name);
                    for(String cars: cust.carList)
                    {
                        System.out.println(cars);
                    }
                }
            }
            else if(i==2)
            {
                int num_of_cars;
                System.out.println("Please enter the customer Id: ");
                custId = obj.nextInt();
                System.out.println("Please enter the customer Name: ");
                custName = obj.next();
                System.out.println("Please enter the number of cars Customer have: ");
                num_of_cars = obj.nextInt();
                ArrayList<String> customerCar = new ArrayList<String>();
                for(int j=0;j<num_of_cars;j++)
                {
                    customerCarList=null;
                    System.out.println("Please enter the Car name: ");
                    customerCar.add(obj.next());
                    customerCarList=customerCar;
                }
                addCustomer();
                JavaApplication3 mainActivity = new JavaApplication3(this.customers);
            }
            else if(i==3)
            {
                Prizes prizes = new Prizes(this.customers);
            }
        }while(a!=4);
        System.out.println("Logging Out");
    }
    public void addCustomer()
    {

        Customer cust = new Customer(custId,custName,customerCarList);
        customers.add(cust);
    }
}