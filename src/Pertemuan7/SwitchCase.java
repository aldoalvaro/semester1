package Pertemuan7;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ket;
        System.out.print("Masukkan angka (1-7):");
        int hari = input.nextInt();
        switch (hari) {
            case 1:
                ket = ("Hari: Senin");
                break;
            case 2:
                ket = ("Hari: Selasa");
                break;
            case 3:
                ket = ("Hari: Rabu");
                break;
            case 4:
                ket = ("Hari: Kamis");
                break;
            case 5:
                ket = ("Hari: Jumat");
                break;
            case 6:
                ket = ("Hari: Sabtu");
                break;
            case 7:
                ket = ("Hari: Minggu");
                break;
            default:
                ket = ("Angka tidak valid! Masukkan angka 1-7");

        }
        System.out.println(ket);
    }

}
