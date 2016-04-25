/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day8;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author vichet
 */
public class Customer {
    private String email,password;
    private Date dob;
    private double amount;

    public Customer() {
    }

    public Customer(String email, String password, Date dob, double amount) {
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.amount = amount;
    }

    public Customer(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Customer){
            Customer c = (Customer)obj;
            return c.getEmail().equalsIgnoreCase(email);
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Customer{" + "email=" + email + ", password=" + password + ", dob=" + dob + ", amount=" + amount + '}';
    }
    
}
