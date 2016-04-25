/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day7;

/**
 *
 * @author vichet
 * @param <T> as parameter in generic class
 */
public class Holder<T> {
    private T o;
    public Holder(T o){
        this.o = o;
    }
    public void setHolder(T o){
        this.o = o;
    }
    public T getHolder(){
        return o;
    }
}
