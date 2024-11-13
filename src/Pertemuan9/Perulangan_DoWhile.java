package Pertemuan9;

import java.util.Scanner;

public class Perulangan_DoWhile {

    public static void main(String[] args) {
        int i = 1;
        String nama;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("masukkan nama ke-" + i + ":");
            nama = sc.next();
            i++;
        } while (i <= 5);

    }
}
