/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg2_oop2;

/**
 *
 * @author ramon
 */
public class DoubleLinkedList<T> {
    private ListNode<T> head;
    private ListNode<T> tail;
    
    public DoubleLinkedList() {
        head = null;
    }
    
    public boolean isFound(T x) {
        ListNode actualNode = head;
        while ((actualNode != null) && !x.equals(actualNode.getElement())) {
            actualNode = actualNode.getNext();
        }
        if (actualNode == null) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void insert(T element) {
        if (head == null) {
            head = new ListNode(element, head);
            tail = head;
        }
        else
        {
            head = new ListNode(element, head);
        }
        
    }
    
    public int length() {
        int count = 0;
        ListNode actualNode = head;

        while (actualNode != null) {
            count++;
            actualNode = actualNode.getNext();
        }
        
        return count;
    }
    
    public ListNode getHead() {
        return head;
    }
              
    public static void main(String[] args) {

        DoubleLinkedList<String> myList = new DoubleLinkedList<String>();
        myList.insert("Hallo");
        myList.insert("Test1");
        myList.insert("Test2");
        
        System.out.println(myList.isFound("Test13"));
    }
}

