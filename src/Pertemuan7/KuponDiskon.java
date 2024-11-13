package Pertemuan7;

import java.util.Scanner;

public class KuponDiskon {

    public static void main(String[] args) {
        String kupon;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode kupon: ");
        kupon = input.next().toUpperCase();

        switch (kupon) {
            case "SAVE10":
                System.out.println("Diskon: 10%");
                break;
            case "SAVE20":
                System.out.println("Diskon: 20%");
                break;
            case "SAVE30":
                System.out.println("Diskon: 30%");
                break;
            case "NONE":
                System.out.println("Tidak ada diskon");
                break;
            default:
                System.out.println("kode kupon tidak valid");

        }

    }

}
