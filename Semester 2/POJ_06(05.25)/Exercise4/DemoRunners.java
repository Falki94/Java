/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

import java.util.Scanner;

/**
 *
 * @author Falki
 */
public class DemoRunners {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a Runner(Athlete/Machine/Political Candidate) : ");
        String choice = sc.nextLine();
        switch (choice) {
            case "Althete": {
                Athlete athlete = new Athlete();
                athlete.run();
                break;
            }
            case "Machine": {
                Machine machine = new Machine();
                machine.run();
                break;
            }
            case "Political Candidate": {
                PoliticalCandidate debil = new PoliticalCandidate();
                debil.run();
                break;
            }
        }
    }
}
