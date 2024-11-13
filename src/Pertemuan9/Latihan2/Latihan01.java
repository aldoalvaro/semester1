package Pertemuan9.Latihan2;

import java.util.Scanner;

public class Latihan01 {

    public static void main(String[] args) {
        int i = 1;
        String nama;
        Scanner sc = new Scanner(System.in);
        while (i <= 5) {
            System.out.print("masukkan nama ke-" + i + ":");
            nama = sc.next();
            i++;
        }
    }
}
