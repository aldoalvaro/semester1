package Pertemuan9.Latihan2;

import java.util.Scanner;

public class Latihan03 {

    public static void main(String[] args) {
        int hitungan;
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan hitungan mundur: ");
        hitungan = sc.nextInt();
        System.out.print("Hitung mundur roket meluncur:");
        for (int i = 1; hitungan >= i; --hitungan) {
            System.out.print(hitungan + " ");
            if (hitungan == 1) {
                System.out.print("-->Goo!");
            }
        }
    }
}
