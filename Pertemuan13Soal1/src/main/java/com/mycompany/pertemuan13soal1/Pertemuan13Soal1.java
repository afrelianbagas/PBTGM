/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13soal1;

/**
 *
 * @author Afrelian
 */
public class Pertemuan13Soal1 {

   class CalculatorSederhana {

        public int tambah(int a, int b) {
            return a + b;
        }

        public int kurang(int a, int b) {
            return a - b;
        }
        
        public int kali(int a, int b) {
            return a * b;
        }
        
        public int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return a / b;
        }
    }
         
    public static void main(String[] args) {
        Pertemuan13Soal1 objekLuar = new Pertemuan13Soal1();
        CalculatorSederhana kalkulator = objekLuar.new CalculatorSederhana();
        
        System.out.println("Hasil Pertambahan : " + kalkulator.tambah(20, 10));
        System.out.println("Hasil Pengurangan : " + kalkulator.kurang(20, 10));
        System.out.println("Hasil Perkalian : " + kalkulator.kali(20, 10));
        System.out.println("Hasil Pembagian : " + kalkulator.bagi(20, 10));
    }
    
}
