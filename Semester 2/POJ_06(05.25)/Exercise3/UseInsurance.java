/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

import java.util.Scanner;

/**
 *
 * @author Falki
 */
public class UseInsurance {

    public static void main(String[] args) {
        Insurance ins;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.equals("1")) {
            ins = new Health("Health Insurance");
            ins.display();
        } else if (str.equals("2")){
            ins = new Life("Life Insurance");
            ins.display();
        } else{
            System.out.println("Something definitely went wrong. There are just 2 options");
        }
    }
}
