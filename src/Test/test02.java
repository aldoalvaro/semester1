/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class test02 {

    public static void main(String[] args) {
        int barang = 3700;
        int byk_barang;
        boolean status;
        double total;
        double diskon;
        double ttl_pembayaran;

        Scanner sc = new Scanner(System.in);
        System.out.println("harga 1 barang: " + barang);
        System.out.print("masukkan jumlah barang: ");
        byk_barang = sc.nextInt();

        total = byk_barang * barang;

        System.out.println("Total: " + total);

        status = total > 50000;
        System.out.println("dapat diskon: " + status);

        if (status == true) {
            diskon = total / 10;
            System.out.println("diskon 10%:-" + diskon);

            ttl_pembayaran = total - diskon;
            System.out.println("total pembayaran: " + ttl_pembayaran);

        }
    }

}
