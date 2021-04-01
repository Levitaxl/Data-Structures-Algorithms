/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ReverseAString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String str= entrada.nextLine();
        
        char ch[]=str.toCharArray();  
        String reverse="";
        
        int n=str.length()-1;
        
        for (int i = n; i >= 0; i--) reverse+=ch[i];    
        
        System.out.println(reverse);
    }
           
}
