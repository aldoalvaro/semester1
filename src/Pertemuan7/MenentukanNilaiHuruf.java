package Pertemuan7;

import java.util.Scanner;

public class MenentukanNilaiHuruf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        String ket;
        System.out.print("masukkan nilai anda (0-100): ");
        nilai = sc.nextInt();

        if (nilai >= 81 && nilai <= 100) {
            ket = "nilai anda A :Istimewa";
        } else if (nilai >= 76 && nilai <= 80) {
            ket = "nilai anda AB :Amat Baik";
        } else if (nilai >= 66 && nilai <= 75) {
            ket = "nilai anda B : Baik";
        } else if (nilai >= 61 && nilai <= 65) {
            ket = "nilai anda BC : Cukup Baik";
        } else if (nilai >= 51 && nilai <= 60) {
            ket = "nilai anda C : Cukup";
        } else if (nilai >= 0 && nilai <= 50) {
            ket = "nilai anda F : Tidak Lulus";
        } else {
            ket = ("nilai tidak valid");
        }
        System.out.println(ket);

    }

}
