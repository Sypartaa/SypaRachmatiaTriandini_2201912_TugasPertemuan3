/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Input Pecahan Pertama
        System.out.print("Masukkan Pembilang Pecahan Pertama: ");
        int pembilang1 = userInput.nextInt();
        System.out.print("Masukkan Pembagi Pecahan Pertama (tidak boleh 0): ");
        int pembagi1 = userInput.nextInt();

        // Input Pecahan Kedua
        System.out.print("Masukkan Pembilang Pecahan Kedua: ");
        int pembilang2 = userInput.nextInt();
        System.out.print("Masukkan Pembagi Pecahan Kedua (tidak boleh 0): ");
        int pembagi2 = userInput.nextInt();

        // Input Pecahan Ketiga
        System.out.print("Masukkan Pembilang Pecahan Ketiga: ");
        int pembilang3 = userInput.nextInt();
        System.out.print("Masukkan Pembagi Pecahan Ketiga (tidak boleh 0): ");
        int pembagi3 = userInput.nextInt();

        // Operasi Penjumlahan
        double hasilPenjumlahan = (double) (pembilang1 * pembagi2 * pembagi3 + pembilang2 * pembagi1 * pembagi3 + pembilang3 * pembagi1 * pembagi2) / (pembagi1 * pembagi2 * pembagi3);
        System.out.printf("Hasil Penjumlahan = %.2f\n", hasilPenjumlahan);

        // Operasi Pengurangan
        double hasilPengurangan = (double) (pembilang1 * pembagi2 * pembagi3 - pembilang2 * pembagi1 * pembagi3 - pembilang3 * pembagi1 * pembagi2) / (pembagi1 * pembagi2 * pembagi3);
        System.out.printf("Hasil Pengurangan = %.2f\n", hasilPengurangan);

        // Operasi Perkalian
        double hasilPerkalian = (double) (pembilang1 * pembilang2 * pembilang3) / (pembagi1 * pembagi2 * pembagi3);
        System.out.printf("Hasil Perkalian = %.2f\n", hasilPerkalian);

        // Operasi Pembagian
        double hasilPembagian = (double) (pembilang1 * pembagi2 * pembagi3) / (pembilang2 *pembagi1 *  pembilang3);
        System.out.printf("Hasil Pembagian = %.2f\n", hasilPembagian);
        
        userInput.close();
    }
}
