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
public class Latihan2 {

    public static void main(String[] args) {
        String ket;
        int nilai;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nilai: ");
        nilai = sc.nextInt();

        if (nilai > 50) {
            ket = "lulus";
        } else {
            ket = "gagal";
        }
        System.out.println("Keterangan: " + ket);

    }

}
