/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abel23092022;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class latihan11 {
    public static void main(String[] args){
              Scanner input = new Scanner(System.in);
              System.out.print("inputkan nilai pertama: ");
              int nilai1 = input.nextInt();

              System.out.print("inputkan nilai kedua: ");
              int nilai2 = input.nextInt();

              System.out.print("inputkan nilai ketiga: ");
              int nilai3 = input.nextInt();

              System.out.print("Rata-rata: " +((nilai1+nilai2+nilai3)/3));
    }
}
