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
public class Latihan3 {

    public static void main(String[] args) {
        int a;
        String ket;

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan a: ");
        a = sc.nextInt();

        if (a > 10) {
            ket = "angka lebih besar dari 10";
        } else {
            ket = "angka tidak lebih besar dari 10";
        }
        System.out.println(ket);
    }

}
