/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abel30092022;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan5{

      public static void main (String[] args){
 BufferedReader dataIn = new BufferedReader(new
 InputStreamReader( System.in) );
            String name1 = "";
            String name2 = "";
            String name3 = "";
            try{
                  System.out.print("Enter Word 1 : ");
                  name1 = dataIn.readLine();
                  System.out.print("Enter Word 2 : ");
                  name2 = dataIn.readLine();
                  System.out.print("Enter Word3 : ");
                  name3 = dataIn.readLine();
             }catch (IOException e){
            }
            System.out.println (name1 + " " + name2 + " " + name3 + " ");
}
}