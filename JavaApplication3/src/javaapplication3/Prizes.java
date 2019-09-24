/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bishal
 */
public class Prizes {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Integer> custId = new ArrayList<Integer>();
    ArrayList<Integer> selection = new ArrayList<Integer>();
    ArrayList<Integer> elegible = new ArrayList<Integer>();
    Scanner obj = new Scanner(System.in);
    int c, size, temp, count = 0;

    public Prizes(ArrayList<Customer> cust) {
        this.customers = cust;
        size = customers.size();
        for (int i = 0; i < size; i++) {
            custId.add(customers.get(i).id);
        }
        for (int x : custId) {
            System.out.println(x);
        }
        if (custId.size() >= 6) {
            for (int i = 0; i < 6; i++) {
                Random r = new Random();
                selection.add(custId.get(r.nextInt(custId.size())));
                custId.remove(custId.indexOf(custId.get(r.nextInt(custId.size()))));
            }
            System.out.println("\n");
            for (int x : selection) {
                System.out.println("Selection" + x);
            }
            System.out.println("Please enter 3 User Id you want from the selection");
            while (count < 3) {
                    try {
                        temp = obj.nextInt();

                    } catch (Exception e) {
                        System.out.println("Wrong Input");
                    }
                temp = obj.nextInt();
                if (selection.contains(temp)) {
                    elegible.add(temp);
                    selection.remove(selection.indexOf(temp));
                    count++;
                } else {
                    System.out.println("Entered Id Does not Exist");
                }
            }
        } else {
            System.out.println("You have less than 6 customer so prize distribution is not possible");
        }

    }
}
