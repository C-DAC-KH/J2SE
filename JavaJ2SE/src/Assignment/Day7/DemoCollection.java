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
public class DemoCollection {
    private Object o;
    public DemoCollection(Object b){
        o = b;
    }

    @Override
    public String toString() {
        return o.toString();
    }
    public static void main(String[] args) {
        DemoCollection d = new DemoCollection("Hello");
        DemoCollection d1 = new DemoCollection(123);
        int num = 123;
        DemoCollection d2 = new DemoCollection(num);
        DemoCollection d3 = new DemoCollection(1.2);
        Integer i1 = 123;//up casting
        int i2 = i1;//down casting
        DemoCollection d4 = new DemoCollection(i1);
        char c = 65;
        DemoCollection d5 = new DemoCollection(c);
        System.out.println(d);
        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
        System.out.println("d3 = "+d3);
        System.out.println("d4 = "+d4);
        System.out.println("i2 = "+i2);
        System.out.println("D5 = "+d5);
        
    }
}
