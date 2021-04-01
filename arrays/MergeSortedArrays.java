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
public class MergeSortedArrays {
    
      public static void main (String[] args) {
           int[] a = new int[]{0,3,4,31};
           int[] b = new int[]{4,6,30};
           int[] c= new int[a.length+b.length];
           
           for (int i = 0; i < a.length; i++) c[i]=a[i]; //O(n)
           for (int i = 0; i < b.length; i++) c[i+a.length]=b[i];//O(m)
           
           
           
           //I know that I can use merge sort, but that is no te point of the lesson  
          Arrays.sort(c);
          System.out.println(Arrays.toString(c));
           
           //O((n+m)*(pln(p)));
      }
    
}
