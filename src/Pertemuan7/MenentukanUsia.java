package Pertemuan7;

import java.util.Scanner;

public class MenentukanUsia {

    public static void main(String[] args) {
        int usia;
        String ket;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan usia anda: ");
        usia = sc.nextInt();

        if (usia >= 1 && usia < 12) {
            ket = "Anak-anak";
        } else if (usia >= 12 && usia <= 19) {
            ket = ("Remaja");
        } else if (usia >= 20 && usia <= 59) {
            ket = ("Dewasa");
        } else if (usia >= 60) {
            ket = ("Lansia");
        } else {
            ket = ("Usia tidak valid");
        }
        System.out.println(ket);
    }

}
