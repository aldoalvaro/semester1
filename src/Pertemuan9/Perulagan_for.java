package Pertemuan9;

import java.util.Scanner;

public class Perulagan_for {

    public static void main(String[] args) {
        String nama;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("masukkan nama ke-" + i + ":");
            nama = sc.next();
        }
    }

}
