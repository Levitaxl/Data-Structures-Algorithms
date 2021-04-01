/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class introduction {
       public static void main(String[] args) {
        // TODO code application logic here
       // System.out.println(new Excercice1().funChallenge(50));
       String[] strings = {"a","b","c","d",""}; 
       //It is like a push
       strings[4]="e";//O(1)->I am not looping throush anything.
       //Ir is like a pop
       strings[4]="";//
       
       System.out.println(Arrays.toString(strings));
    }
    
}
