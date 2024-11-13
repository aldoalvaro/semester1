/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class Latihan04 {

    public static void main(String[] args) {
        double alas;
        double tinggi;
        double luas;
        double sisi_miring;

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan alas: ");
        alas = sc.nextDouble();

        System.out.print("masukkan tinggi: ");
        tinggi = sc.nextDouble();

        luas = (double) alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);

        sisi_miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(luas, 2));
        System.out.println("Panjang sisi miring segitiga adalah = " + sisi_miring);

    }
}
