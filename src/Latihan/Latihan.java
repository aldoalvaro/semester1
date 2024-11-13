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
public class Latihan {

    public static void main(String[] args) {
        int barang = 3700;
        int byk_barang;
        boolean diskon;
        double total;

        Scanner sc = new Scanner(System.in);
        System.out.println("harga 1 barang: " + barang);
        System.out.print("masukkan jumlah barang: ");
        byk_barang = sc.nextInt();

        total = byk_barang * barang;
        System.out.println("Total: " + total);

        diskon = total > 50000;
        System.out.println("diskon: " + diskon);

    }
}
