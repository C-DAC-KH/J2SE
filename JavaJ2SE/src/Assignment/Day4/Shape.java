/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day4;

/**
 *
 * @author Administrator
 */
public abstract class Shape {
    private String name;

    public Shape() {
    }
    public Shape(String name) {
        this.name = name;
    }
    public abstract void draw();
    public abstract void earas();

    
    
}
