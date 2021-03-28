/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigO;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Excercice1 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new Excercice1().funChallenge(50));
    }
    
    public int funChallenge(int input){
        int a=10;//O(1)
        a=50+3;//O(1)
        //Loops are lineal time
         for (int i = 0; i < input; i++) {//O(n)
            anotherFunction();//O(n)-> it´s called n times
            boolean stranger = true;//O(n)-> it´s called n times>
            a++;//O(n)-> it´s called n times
        }
         return a;//O(1)
    }
    
    //3+n+n+n+n=3+4n=O(3+4n)->O(n)

    private void anotherFunction() {
        //do nothing
    }
    
}
