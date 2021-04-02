/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMaps;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class FirstRecurringCharacter {
    
     
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] nums={2,1,1,2,3,4,1,2,4};
        int counter=0;
        int numberToShow = 0;
        for (int i = 0; i < nums.length; i++) map.put(i, nums[i]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int firstEntry=entry.getValue();
            for (Map.Entry<Integer, Integer> entry2 : map.getValue().entrySet()) {
                int secondEntry=entry2.getValue();
                if(firstEntry==secondEntry) {
                    int firstIndex=entry.getKey();
                    int secondIndex=entry2.getKey();
                    if(secondIndex-firstIndex<counter){
                        counter=secondIndex-firstIndex;
                        numberToShow = firstEntry;
                    
                }
                    
                //break;
                //System.out.println("Key = " + entry2.getKey() + ", Value = " + entry2.getValue());
            }
        }
            
            

        

          
    }
        System.out.println(numberToShow);
    
}
}