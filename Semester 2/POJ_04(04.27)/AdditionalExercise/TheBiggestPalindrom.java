/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdditionalExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Falki
 */
public class TheBiggestPalindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String linia = sc.nextLine();
        linia = linia.toLowerCase();
        String[] sa = linia.split("( )|(\\,)|(\\.)|(\\?)|(\\!)|(\\;)|(\\:)");
        for (String s : sa){
            if (s.isEmpty()){
                continue;
            }
            StringBuilder sb = new StringBuilder(s);
            if (sb.reverse().toString().equals(s)){
                list.add(s);
            }
            
        }
        list.stream().sorted();
        System.out.println(list.get(0));
    }
}
