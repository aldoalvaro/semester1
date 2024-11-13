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
public class Latihan7 {

    public static void main(String[] args) {
        int nilai;
        String ket;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai anda (0-100): ");
        nilai = sc.nextInt();

        if (nilai <= 100 && nilai >= 75) {
            ket = "selamat anda lulus";
        } else if (nilai < 75 && nilai >= 50) {
            ket = "anda harus belajar lebih giat";
        } else if (nilai < 50 && nilai >= 0) {
            ket = "anda gagal,coba lagi";
        } else {
            ket = "Error nilai tidak terdeteksi";
        }
        System.out.println(ket);
    }

}
