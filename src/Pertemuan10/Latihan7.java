/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class Latihan7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int batasan, i = 1, countganjil = 0, countgenap = 0;
        System.out.print("masukkan batasan looping: ");
        batasan = sc.nextInt();
        System.out.println("deret bilangan: ");
        while (i <= batasan) {
            System.out.print(i + " ");
            i++;
            if (i % 2 == 0) {
                countgenap++;
            } else {
                countganjil++;
            }
        }
        System.out.println(" ");
        System.out.println("banyak genap: " + countgenap);
        System.out.println("banyak ganjil: " + countganjil);

    }

}
