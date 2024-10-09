/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan15soal2;
import kalkulatorpack.KalkulatorKurang;
import kalkulatorpack.KalkulatorBagi;
import kalkulatorpack.KalkulatorKali;

/**
 *
 * @author Afrelian
 */
public class Pertemuan15Soal2 {

    public static void main(String[] args) {
       
        //Membuat objek dari masing-masing kelas
        KalkulatorKurang kalkulatorKurang = new KalkulatorKurang();
        KalkulatorBagi kalkulatorBagi = new KalkulatorBagi();
        KalkulatorKali kalkulatorKali = new KalkulatorKali();
        
        //Menghitung hasil operasi
        int hasilKurang = kalkulatorKurang.Kurang(10, 5);
        int hasilBagi = kalkulatorBagi.Bagi(10, 2);
        int hasilKali = kalkulatorKali.Kali(10, 5);
        
        //Menampilkan hasil output
        System.out.println("Hasil Pengurangan: " + hasilKurang);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        System.out.println("Hasil Perkalian: " + hasilKali);
    }
}