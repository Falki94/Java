/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Falki
 */
public class DiffrentWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String linia = sc.nextLine();
        linia=linia.toLowerCase();
        String[] sa = linia.split("( )|(\\,)|(\\.)");
        for (String s : sa){
            if (s.isEmpty()){
                continue;
            }
            if (!map.containsKey(s)){
                map.putIfAbsent(s, 1);
            }
        }
        System.out.println(Arrays.toString(map.keySet().stream().sorted().toArray()));
        System.out.println(map.size());
    }
}
