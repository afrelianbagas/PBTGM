/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5soal2;
import java.util.Scanner;
/**
 *
 * @author Afrelian
 */
public class Pertemuan5Soal2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai alas: ");
        double alas = myInput.nextDouble();

        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = myInput.nextDouble();

        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;

        // Menampilkan hasil
        System.out.println("Luas Segitiga : " + luas);

        myInput.close();
    }
}
