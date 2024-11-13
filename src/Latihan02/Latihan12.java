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
public class Latihan12 {

    public static void main(String[] args) {
        int tahun;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        tahun = sc.nextInt();

        if (tahun % 4 == 0) {
            System.out.println(tahun + " adalah tahun kabisat");
//        } else if (tahun % 100 == 0) {
//            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println("bukan tahun kabisat");

        }
    }
}
