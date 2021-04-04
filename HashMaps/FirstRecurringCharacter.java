/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class FirstRecurringCharacter {
    private Integer firstRecurringCharacter(int[] array) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int element : array) {
            if (hashSet.contains(element)) {
                return element;
            } else {
                hashSet.add(element);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 2, 3, 5, 1, 2, 4};
        FirstRecurringCharacter obj = new FirstRecurringCharacter();
        System.out.println(obj.firstRecurringCharacter(arr));
    }
}