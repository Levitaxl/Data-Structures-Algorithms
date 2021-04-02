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
public class Example {
      public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> phoneBook = new HashMap<String, String>();
        phoneBook.put("Sally Smart", "555-9999");
        phoneBook.put("John Doe", "555-1212");
        phoneBook.put("J. Random Hacker", "555-1337");
          System.out.println(phoneBook.get("Sally Smart"));

    }
    
}
