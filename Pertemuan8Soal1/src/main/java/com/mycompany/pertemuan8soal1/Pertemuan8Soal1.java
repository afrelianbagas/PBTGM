/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8soal1;
import java.util.Scanner;
/**
 *
 * @author Afrelian
 */
public class Pertemuan8Soal1 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Nilai Awal?: " );
        int nilaiAwal = myInput.nextInt();
        
        System.out.println("Niai Akhir ?: ");
        int nilaiAkhir = myInput.nextInt();
        
        System.out.println(" Hasil nya: ");
        
        for (int i=nilaiAwal; i<=nilaiAkhir;i+=5) {
        System.out.println(i);
        
        }       
    }
}
