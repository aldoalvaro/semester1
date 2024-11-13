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
public class Latihan6 {

    public static void main(String[] args) {
        int a;
        int b;
        String ket;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = sc.nextInt();

        if (a > b) {
            ket = "angka pertama lebih besar";
        } else if (a == b) {
            ket = "angka pertama sama dengan angka kedua";
        } else {
            ket = "angka kedua lebih besar";
        }
        System.out.println(ket);

    }

}
