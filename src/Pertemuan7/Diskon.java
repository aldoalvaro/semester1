package Pertemuan7;

import java.util.Scanner;

public class Diskon {

    public static void main(String[] args) {
        int total, totald;
        String ket;
        double diskon;
        boolean status;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total belanjaan anda: ");
        total = sc.nextInt();

        if (total >= 500000) {
            diskon = total * 0.2;
            totald = (int) (total - diskon);
            ket = "selamat anda mendapatkan potongan sebesar 20%. \nTotal belanja anda menjadi: " + totald;
        } else if (total >= 200000) {
            diskon = total * 0.1;
            totald = (int) (total - diskon);
            ket = "Selamat anda mendapatkan potongan sebesar 10%. \nTotal belanja anda menjadi: " + totald;
        } else {
            ket = ("anda tidak mendapatkan potongan harga");
        }
        System.out.println(ket);

    }

}
//int hargabarang, total, jumlahbarang;
//        double diskon;
//        boolean status;
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("masukkan jumlah barang belanjaan anda: ");
