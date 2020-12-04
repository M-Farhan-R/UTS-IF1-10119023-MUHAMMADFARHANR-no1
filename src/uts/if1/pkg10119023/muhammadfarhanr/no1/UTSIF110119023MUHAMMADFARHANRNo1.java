/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uts.if1.pkg10119023.muhammadfarhanr.no1;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : Program menampilkan umur
 *
 */
import java.time.Year;
import java.util.Scanner;
public class UTSIF110119023MUHAMMADFARHANRNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Age a = new Age(Year.now().getValue());
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        a.setYearBirth(scan.nextInt());
        int umur = a.hitungUmur();
        System.out.println();
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun lahir anda : "+a.getYearBirth());
        System.out.println("Hari ini tahun : "+a.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+umur+" tahun");
        System.out.println("Tandanya Kamu ".concat(a.tandanyaKamu(umur)));
    }

}
