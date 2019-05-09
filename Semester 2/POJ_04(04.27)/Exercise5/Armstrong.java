/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise5;

import java.util.Scanner;

/**
 *
 * @author Falki
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int newNumber, remainder, result = 0;
        newNumber = number;
        while (newNumber != 0) {
            remainder = newNumber % 10;
            result += Math.pow(remainder, 3);
            newNumber /= 10;
        }
        if (result == number){
            System.out.println(number +" is an Armstrong number");
        }
        else {
            System.out.println(number +" is not an Armstrong number");
        }
    }

}
