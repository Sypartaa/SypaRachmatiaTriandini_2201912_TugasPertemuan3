/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String pecahan1, pecahan2, pecahan3;
        boolean fractionsAreEqual;

        do {
            System.out.print("Masukkan Pecahan Pertama (pembilang/pembagi): ");
            pecahan1 = userInput.next();
            System.out.print("Masukkan Pecahan Kedua (pembilang/pembagi): ");
            pecahan2 = userInput.next();
            System.out.print("Masukkan Pecahan Ketiga (pembilang/pembagi): ");
            pecahan3 = userInput.next();

            fractionsAreEqual = checkFractionsEquality(pecahan1, pecahan2, pecahan3);

            if (fractionsAreEqual) {
                System.out.println("Pecahan tidak boleh sama. Silakan masukkan pecahan yang berbeda.");
            }

        } while (fractionsAreEqual);

        String[] parts1 = pecahan1.split("/");
        String[] parts2 = pecahan2.split("/");
        String[] parts3 = pecahan3.split("/");

        double variable1 = Double.parseDouble(parts1[0]) / Double.parseDouble(parts1[1]);
        double variable2 = Double.parseDouble(parts2[0]) / Double.parseDouble(parts2[1]);
        double variable3 = Double.parseDouble(parts3[0]) / Double.parseDouble(parts3[1]);

        double penjumlahan = variable1 + variable2 + variable3;
        double pengurangan = variable1 - variable2 - variable3;
        double perkalian = variable1 * variable2 * variable3;
        double pembagian = variable1 / variable2 / variable3;

        System.out.printf("Hasil Penjumlahan = %.2f\n", penjumlahan);
        System.out.printf("Hasil Pengurangan = %.2f\n", pengurangan);
        System.out.printf("Hasil Perkalian = %.2f\n", perkalian);
        System.out.printf("Hasil Pembagian = %.2f\n", pembagian);

        userInput.close();
    }

    private static boolean checkFractionsEquality(String pecahan1, String pecahan2, String pecahan3) {
        return pecahan1.equals(pecahan2) || pecahan1.equals(pecahan3) || pecahan2.equals(pecahan3);
    }
}