/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author LAB282
 */
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lagi;

        do {

            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scanner.nextDouble();

            double luas = Math.PI * jariJari * jariJari;

            System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah %.2f%n", jariJari, luas);

            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            lagi = scanner.next();
        } while (lagi.equalsIgnoreCase("ya"));

        scanner.close();
        System.out.println("Terima kasih!");
    }
}
