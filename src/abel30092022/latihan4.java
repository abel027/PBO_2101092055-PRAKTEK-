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
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class latihan4 {
    public static void main( String[] args ){

    BufferedReader dataIn = new BufferedReader(new
    InputStreamReader( System.in) );
        String r="";
        String s="";
            
            r=JOptionPane.showInputDialog("Masukkan nilai pertama : ");
            int pertama = Integer.parseInt(r);
            s=JOptionPane.showInputDialog("Masukkan nilai kedua : ");
            int kedua = Integer.parseInt(s);
            int jumlah=pertama+kedua;
            String hasil="";
            hasil += "Nilai pertama: " +pertama +"\n";
            hasil += "Nilai kedua: " +kedua +"\n";
            hasil += "Jumlah Penjumlahan :  " +jumlah+"\n";

            JOptionPane.showMessageDialog(null, hasil);
    }
}
/*
public static void main( String[] args ){
        
 int angka1 = 0;
 int angka2 = 0;
 int jumlah = 0;
 
 angka1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke-1"));
 angka2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke-2"));
 
 jumlah = angka1 + angka2;
 
 JOptionPane.showMessageDialog(null, "Jumlah = " + jumlah);
 }
}
*/