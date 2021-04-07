/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;


import java.io.*;
 
// Java program to implement
// a Singly Linked List
public class LinkedList {
    //SRC: https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
 
    Node head;
    static class Node {

        int data;
        Node next;
        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    // **************INSERTION**************
 
    public static LinkedList insert(LinkedList list,
                                    int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
 
        if (list.head == null) list.head = new_node;
        else {
            Node last = list.head;
            while (last.next != null) last = last.next;
            last.next = new_node;
        }
        return list;
    }
 
    // **************TRAVERSAL**************
    
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        System.out.print("\nLinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("\n");
    }
 
    // **************DELETION BY KEY**************
    public static LinkedList deleteByKey(LinkedList list,
                                         int key)
    {
        // Store head node
        Node currNode = list.head, prev = null;
 
        //
        // CASE 1:
        // If head node itself holds the key to be deleted
 
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head
            System.out.println(key + " found and deleted");
            return list;
        }

        
        while (currNode != null && currNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }

        
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }
 
        if (currNode == null) System.out.println(key + " not found");

        
        return list;
    }
 
    // **************DELETION AT A POSITION**************
 
    // Method to delete a node in the LinkedList by POSITION
    public static LinkedList
    deleteAtPosition(LinkedList list, int index)
    {
        // Store head node
        Node currNode = list.head, prev = null;
 
        //
        // CASE 1:
        // If index is 0, then head node itself is to be
        // deleted
 
        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head
 
            // Display the message
            System.out.println(
                index + " position element deleted");
 
            // Return the updated List
            return list;
        }
 
        //
        // CASE 2:
        // If the index is greater than 0 but less than the
        // size of LinkedList
        //
        // The counter
        int counter = 0;
 
        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null) {
 
            if (counter == index) {
                // Since the currNode is the required
                // position Unlink currNode from linked list
                prev.next = currNode.next;
 
                // Display the message
                System.out.println(
                    index + " position element deleted");
                break;
            }
            else {
                // If current position is not the index
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
 
        // If the position element was found, it should be
        // at currNode Therefore the currNode shall not be
        // null
        //
        // CASE 3: The index is greater than the size of the
        // LinkedList
        //
        // In this case, the currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(
                index + " position element not found");
        }
 
        // return the List
        return list;
    }
    
    public static int count(LinkedList list){
        
        int counter=0;
        
        Node currNode = list.head,prev;
        while (currNode != null) {
            prev = currNode;
            currNode = currNode.next;
            counter++;
        }
        return counter;
    }
    
    
    
    public static void reverse ( LinkedList list){
        int counter=0;
        int per=1;
        Node currNode = list.head, prev = null,aux=null,nextNode=null,nextNode2=null;
        int totalNodes=count(list);
        int data=0;
        for (int i = 0; i < totalNodes; i++) {
            for (int j = 0; j < totalNodes-i; j++) {
                if(currNode.next!=null){
                    data=currNode.data;
                    currNode.data=currNode.next.data;
                    currNode.next.data=data;
                    System.out.println(currNode.data);
                    prev = currNode;
                    currNode = currNode.next;
                }
            }
        }
        
      printList(list);
    
    }
    
    
 
    // **************MAIN METHOD**************
 
    // method to create a Singly linked list with n nodes
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();
 
        //
        // ******INSERTION******
        //
 
        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
 
       // printList(list);
        reverse(list);
    }
}