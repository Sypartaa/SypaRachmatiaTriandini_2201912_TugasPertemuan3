/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

public class No3 {
    public static void main(String[] args) {
        // Mendapatkan kode ASCII dari karakter 'X' dan 'y'
        char karakterX = 'X';
        char karakterY = 'y';

        int kodeASCIIX = (int) karakterX;
        int kodeASCIIY = (int) karakterY;

        // Menjumlahkan kode ASCII dari kedua karakter
        int jumlahKodeASCII = kodeASCIIX + kodeASCIIY;

        // Menampilkan hasil jumlah
        System.out.println("Kode ASCII dari 'X': " + kodeASCIIX);
        System.out.println("Kode ASCII dari 'y': " + kodeASCIIY);
        System.out.println("Jumlah Kode ASCII dari 'X' dan 'y': " + jumlahKodeASCII);
    }
}
