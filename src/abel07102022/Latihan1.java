/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abel07102022;

/**
 *
 * @author User
 */
public class Latihan1 {
    public static void main(String[] args) {
        double grade = 92.0;
        if (grade >= 90) {
            System.out.println("Exellent!");
        } else if ((grade < 90) && (grade >= 80)) {
            System.out.println("Good Job!");
        } else if ((grade < 80) && (grade >= 60)) {
            System.out.println("Study harder!");
        } else {
            System.out.println("Sorry, you failed.");
        }
        
    }
}
