/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS181122_B;

/**
 *
 * @author User
 */
public class PeminjamanAbelExample {
    public static void main(String[] args){
        PeminjamanAbel nasabah1 = new PeminjamanAbel();
        
        nasabah1.setKodepinjam("01");
        nasabah1.setTanggal("18112022");
        nasabah1.setKodenasabah("Ma01");
        nasabah1.setNama("Muhammad Abbel");
        nasabah1.setJumlah(200000);
        nasabah1.setLama(1);
        
        System.out.println("Kode Peminjaman: "+nasabah1.getKodepinjam());
        System.out.println("Tanggal: "+nasabah1.getTanggal());
        System.out.println("Kode Nasabah: "+nasabah1.getKodenasabah());
        System.out.println("Nama Nasabah: "+nasabah1.getNama());
        System.out.println("Jumlah Pinjaman: "+nasabah1.getJumlah());
        System.out.println("Lama Pinjaman (dalam bulan): "+nasabah1.getLama());
        System.out.println("Bunga : "+nasabah1.getBunga());
        System.out.println("Angsuran Pokok : "+nasabah1.getAngsuranpokok());
        System.out.println("Angsuran Perbulan : "+nasabah1.getAngsuranbulan());
        System.out.println("Total Hutang : "+nasabah1.getHutang());
        
    }
}