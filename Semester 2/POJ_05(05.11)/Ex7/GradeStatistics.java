/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Falki
 */
public class GradeStatistics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=students;i++){
            System.out.print("Enter the grade for student " + i + ":");
            int grade=sc.nextInt();
            list.add(grade);
        }
        double mean = list.stream().mapToInt(i->i).average().getAsDouble();
        System.out.print("The grades are: ");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.print("The average is: ");
        System.out.printf("%.2f\n", mean);
        System.out.print("The median is: ");
        System.out.printf("%.2f\n", median(list));
        System.out.println("The minimum is: " + Collections.min(list));
        System.out.println("The maximum is: " + Collections.max(list));
        System.out.print("The standard deviation is: ");
        System.out.printf("%.2f\n",standardDeviation(mean, list));
    }
    public static double standardDeviation(double mean, List<Integer> list){
        double sum = 0;
        for (Integer i : list){
            sum += Math.pow(i-mean, 2);
        }
        return Math.sqrt(sum/list.size());
    }
    public static double median(List<Integer> list){
        list = list.stream().sorted().collect(Collectors.toList());
        int n = list.size();
        if (n%2!=0){
            return (double)list.get(n/2);
        }
        return (double)(list.get((n-1)/2) +list.get(n/2))/2.0;
    }
}
