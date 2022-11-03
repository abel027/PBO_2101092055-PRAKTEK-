/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abel28102022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class Latihan2buf {
    public static void main(String[] args) {
        BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
        int nilai[]=new int[10];
        String input="";
        
        for (int i=0;i<nilai.length;i++)
        {
            System.out.print("Masukan Nilai Ke - "+(i+1)+":");
        try{
            input=in.readLine();nilai[i]=Integer.parseInt(input);
        }
        catch(Exception e){}
        }
        int terbesar=nilai[0];for(int i=0;
             i<nilai.length; i++)
            
        {if(nilai[i]>terbesar){terbesar=nilai[i];}}
        
        System.out.println("");System.out.println("Input terbesar adalah:"+terbesar);
    }
}

