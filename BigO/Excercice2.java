package BigO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Excercice2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new Excercice2().anotherFunChallenge(50));
    }
    
    public int anotherFunChallenge(int input){
        int a=5;//O(1)
        int b=10;//O(1)
        int c=50;//O(1)
        //Loops are lineal time
         for (int i = 0; i < input; i++) {//O(n)
            int x= i+1;//O(n)
            int y= i+2;//O(n)
            int z= i+3;//O(n)
        }
         
         for (int j = 0; j < input; j++) {//O(n)
             int p=j*2;//O(n)
             int q=j*2;//O(n)
            
        }
        String whoAmI="I don´t know";//O(1)
        
        
        
        return 1;//O(1)
    }
    
     //1+1+1+n+n+n+n+n+n+n+1=4+7n

    private void anotherFunction() {
        //do nothing
    }
}
