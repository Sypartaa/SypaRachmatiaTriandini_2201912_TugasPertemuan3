/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

import java.util.Scanner;

public class No2 {
     public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Input tabungan dan status calon pasangan
        System.out.print("Masukkan jumlah uang tabungan: ");
        double tabungan = userInput.nextDouble();
        System.out.print("Apakah Anda sudah memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = userInput.nextBoolean();

        // Evaluasi ekspresi untuk menentukan apakah dapat menikah
        if (tabungan > 100000000 && calonPasangan) {
            System.out.println("Anda dapat menikah! Selamat!");
        } else {
            System.out.println("Maaf, Anda belum dapat menikah. Periksa kembali syaratnya.");
        }

        userInput.close();
    }
}