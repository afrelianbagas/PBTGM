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
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai alas: ");
        double alas = input.nextDouble();

        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = input.nextDouble();

        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;

        // Menampilkan hasil
        System.out.println("Luas Segitiga : " + luas);

        input.close();
    }
}
