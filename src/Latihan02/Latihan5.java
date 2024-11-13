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
public class Latihan5 {

    public static void main(String[] args) {
        String Huruf, ket;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah huruf: ");
        Huruf = sc.nextLine();

        if ("A".equalsIgnoreCase(Huruf)) {
            ket = "Huruf adalah A";
        } else {
            ket = "Huruf bukan A";
        }
        System.out.println(ket);
    }

}
