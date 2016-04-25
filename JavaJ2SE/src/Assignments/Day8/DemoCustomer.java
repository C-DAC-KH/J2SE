/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments.Day8;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author vichet
 */
public class DemoCustomer {
    public static void createCustomers(){
        Scanner keyboard = new Scanner(System.in);
        String email,psd;
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        Date dob = new Date();
        System.out.println("Enter Email:");
        email = keyboard.nextLine();
        System.out.println("Password:");
        psd = keyboard.nextLine();
        System.out.println("Enter date of birth:");
        
    }
    public static void main(String[] args) {
        Customers cus[] = {
            new Customers("vichet@gmail.com", "123", new Date(), 600),
            new Customers("sokha@gmail.com", "sok", new Date(), 200),
            new Customers("bopha@gmail.com","bopha",new Date(),400)
        };
        ArrayList<Customers> lists = new ArrayList<>();
        lists.addAll(Arrays.asList(cus));
        
        System.out.println(lists);
        
        
    }
}
