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
public class SpaceComplexity {
    public static void main(String[] args) {
        new SpaceComplexity().booo(5);
        // TODO code application logic here
        //System.out.println("hello world");
    }
    
    //Time  Complexity->O(n)
    //Space Complexity->O(1)
   public int booo(int n){
       for (int i = 0; i < n; i++) {
           System.out.println("booo!");
       }
       return 1;
   }
   
   
   //Time  Complexity-> O(n)
   //Space Complexity-> O(n) 
   public void arrayOfHinTImes(int n){
       String[] hiArray= new String[n];
       
       for (int i = 0; i < n; i++) {//O(1)-> i
           hiArray[i]="hi";//O(n)->hiArray[i]->ntimes
       }
   }

}
