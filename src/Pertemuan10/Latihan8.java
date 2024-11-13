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
public class Latihan8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil, total = 0, genap = 0, ganjil = 0, i = 1;
        do {
            System.out.print("inputkan bilangan " + i + ": ");
            bil = sc.nextInt();
            total = total + bil;
            i++;
            if (bil % 2 == 0) {
                genap++;
            } else {
                ganjil++;
            }
        } while (i <= 5);
        System.out.println("");
        System.out.println("jumlah bilangan genap: " + genap);
        System.out.println("jumlah bilangan ganjil: " + ganjil);
        System.out.println("total seluruh bilangan: " + total);

    }
}
