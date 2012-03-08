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
public class Ringbuffer<T> {
    private ArrayList<T> ringBuffer;
    private int size;
    private int head = 0;
    private int tail = 0;
    
    public Ringbuffer (int size) {
        this.size = size;
        ringBuffer = new ArrayList<T>();
    }
    
    public void enqueue(T x) {
        // Fügt x am Ende in die Warteschlange ein,
        // falls die Warteschlange nicht voll ist; 
        if (!this.isFull()) {
            ringBuffer.add(x);
            tail++;
        }
    }
    public T dequeue() {
        // Entfernt das erste Element aus der Warteschlange,
        // falls die Warteschlange nicht leer ist; 
        T result;
        if (!this.isEmpty()) {
            
            result = ringBuffer.remove(0);  
            head++;
        }
        else {
            result = null;
        }
        return result;
        
    }
    public boolean isEmpty() {
        //liefert true genau dann, wenn die Warteschlange kein Element enthält 
        return ringBuffer.isEmpty();
    }
    public boolean isFull() {
        //liefert true genau dann, wenn die Warteschlange voll ist 
        if (ringBuffer.size() >= size) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Ringbuffer<String> test = new Ringbuffer<String>(5);
        
        String test1 = "12345";
        String test2 = "abcde";
        String test3 = "ABCDE";
        String test4 = "67890";
        String test5 = "fghij";
        String test6 = "FGHIJ";
        
        test.enqueue(test1);
        test.enqueue(test2);
        test.enqueue(test3);
        test.enqueue(test4);
        test.enqueue(test5);
        test.enqueue(test6);
        
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
    }
}
