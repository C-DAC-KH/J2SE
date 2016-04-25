/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vichet
 */
public class DemoCustomer {

    public static Customer[] createCustomer() throws CustomerException {
        String email, psd, dob;
        Date date = new Date();
        int numCus;
        double amount;
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many Customer?");
        numCus = keyboard.nextInt();

        Customer cus[] = new Customer[numCus];

        for (int i = 0; i < cus.length; i++) {
            keyboard.nextLine();
            System.out.println("Enter your email!");
            email = keyboard.nextLine();
            System.out.println("Enter your password");
            psd = keyboard.nextLine();
            System.out.println("Enter Date of birth!");
            dob = keyboard.nextLine();
            try {
                date = df.parse(dob);
            } catch (ParseException ex) {
                System.out.println("date : " + ex.getMessage());
            }
            System.out.println("Enter Amount!");
            amount = keyboard.nextDouble();
            cus[i] = new Customer(email, psd, date, amount);
            for (int k = 0; k < i; k++) {
                try {
                    if (cus[i].getEmail().equalsIgnoreCase(cus[k].getEmail())) {
                        --i;
                        throw new CustomerException("Email was existed");
                    }
                } catch (Exception e) {

                }
            }

        }

        return cus;
    }

    public static ArrayList<Customer> unSubCustomer(ArrayList<Customer> lists) throws CustomerException {
        String email;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Email:");
        email = keyboard.nextLine();
        int index = lists.indexOf(new Customer(email));
        try {
            if (lists.contains(new Customer(email))) {
                lists.remove(index);
                return lists;
            } else {
                throw new CustomerException("Customer was not found!");
            }

        } catch (Exception e) {
            return null;
        }

    }

    public static ArrayList<Customer> updateCustomer(ArrayList<Customer> lists) {
        String email, newPsd = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Email:");
        email = keyboard.nextLine();
        int index = lists.indexOf(new Customer(email));
        if (lists.contains(new Customer(email))) {
            Customer c = lists.get(index);
            System.out.println("Old password is " + c.getPassword() + " Enter new Password ");
            newPsd = keyboard.nextLine();
            c.setPassword(newPsd);
            lists.set(index, c);
        }
        return lists;
    }

    public static void main(String[] args) throws CustomerException {
//        ArrayList<Customer> lists = new ArrayList<>();
//        lists.addAll(Arrays.asList(createCustomer()));
//        System.out.println(lists);
//        lists = unSubCustomer(lists);
//        System.out.println(lists);
//        lists = updateCustomer(lists);
//        System.out.println(lists);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = "01/01/2015";
        try {
            Date date = formatter.parse(dateInString);
            System.out.println(date);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
