/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop2;

import java.util.ArrayList;

/**
 *
 * @author ramon
 */
public class Stack<T> {
    //private int size;
    private int top = 0;
    
    private ArrayList<T> stack;
    
    public Stack() {
        //size = s;
        stack = new ArrayList<T>();
    }
    
    public void push(T o) {
        stack.add(o);
    }
    
    public T pop() {
        return stack.remove(stack.size() -1);
    }
    
    public static void main(String[] args) {
        Stack<String> test = new Stack<String>();
        
        String string1 = "1234";
        String string2 = "TEST";
        
        test.push(string1);
        test.push(string2);
        
        System.out.println(test.pop());
        System.out.println(test.pop());
    }
    
}
