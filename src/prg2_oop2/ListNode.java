/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop2;

/**
 *
 * @author ramon
 */
public class ListNode<T> {
    private T element;
    private ListNode next;
    private ListNode prev;
    
    public ListNode(T element, ListNode next) {
        this.element = element;
              
        this.next = next;
        
        if (next != null) {
            next.prev = this;
        }
    }
    
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public ListNode getNext() {
        return next;
    }
    
    public ListNode getPrev() {
        return prev;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
    
    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
