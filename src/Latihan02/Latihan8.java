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
public class Latihan8 {

    public static void main(String[] args) {
        int suhu;
        String ket;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam celcius: ");
        suhu = sc.nextInt();

        if (suhu >= 30) {
            ket = "Cuaca Panas";
        } else if (suhu >= 15) {
            ket = "Cuaca Sedang";
        } else {
            ket = "Cuaca Dingin";
        }
        System.out.println(ket);
    }

}
