/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan02;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class Latihan11 {

    public static void main(String[] args) {
        int bulan;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan (1-12): ");
        bulan = sc.nextInt();

        {
            if (bulan < 1 || bulan > 12) {
                System.out.println("Bulan tidak valid");
            } else if (bulan == 2) {
                System.out.println("Bulan Februari");
            } else if (bulan % 2 == 0) {
                System.out.println("Bulan Genap");
            } else {
                System.out.println("Bulan Ganjil");
            }

        }
    }
}
