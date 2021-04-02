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
public class HashMapsRepl {
      public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(new Excercice1().funChallenge(50));
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        phoneBook.put("Grapes", 1000);
        System.out.println(phoneBook.get("Grapes"));
    }
    
}
