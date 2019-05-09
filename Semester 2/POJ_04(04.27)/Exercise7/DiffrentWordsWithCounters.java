/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Falki
 */
public class DiffrentWordsWithCounters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String linia = sc.nextLine();
        linia = linia.toLowerCase();
        int counter = 1;
        String[] sa = linia.split("( )|(\\,)|(\\.)");
        for (String s : sa) {
            if (s.isEmpty()) {
                continue;
            }
            counter = map.containsKey(s) ? map.get(s) : 0;
            map.put(s, counter + 1);
        }
        System.out.println(Arrays.toString(map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().thenComparing(Map.Entry.comparingByKey())).toArray()));
    }
}
