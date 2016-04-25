/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments.Day8;

import java.util.Date;

/**
 *
 * @author vichet
 */
public class Customers {
    private String email,password;
    private Date dob;
    private double amount;

    public Customers(String email, String password, Date dob, double amount) {
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.amount = amount;
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
    public String toString() {
        return "Customers{" + "email=" + email + ", password=" + password + ", dob=" + dob + ", amount=" + amount + '}';
    }
    
    
}
