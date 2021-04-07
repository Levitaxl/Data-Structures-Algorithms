/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;
import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class Reverse {
    static Node head;
 
    static class Node {
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
 
 
    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
  }
    
}
