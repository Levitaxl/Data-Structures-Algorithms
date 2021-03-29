/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigO;

/**
 *
 * @author usuario
 */
public class LogAllPairsOfArray {
      public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        
          for (int i = 0; i < 10; i++) {
              for (int j = 0; j < 10; j++) {
                  System.out.println(a[i]+" "+a[j]);
              }
          }
          
          //O(n*n)
    }
}
