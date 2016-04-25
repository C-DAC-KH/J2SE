/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day7;

/**
 *
 * @author vichet
 */
public class DemoHolder {
    public static void main(String[] args) {
        Holder<Integer> h1 = new Holder<>(12);
        System.out.println(" h1 " + h1.getHolder());
        System.out.println("h1 "+h1.getClass().getName());
    }
}
