package Pertemuan9.Latihan2;

import java.util.Scanner;

public class Latihan02 {

    public static void main(String[] args) {
        String nama;
        int nilai;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("No\tNama\tNilai");
        do {
            System.out.print(i + "\t");
            nama = sc.next();
            nilai = sc.nextInt();
            i++;
        } while (i <= 5);
    }
}
