/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class Latihan9 {

    public static void main(String[] args) {
        String nama, ket = null;
        double nilai, total = 0;
        System.out.println("No\tNama\tNilai\tNilaiHuruf");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            nama = JOptionPane.showInputDialog("masukkan nama:");
            System.out.print("\t"+nama);
            String Nilai = JOptionPane.showInputDialog("masukkan nilai: ");
            nilai = Integer.parseInt(Nilai);
            System.out.print("\t"+nilai);
            if (nilai > 80 && nilai<=100) {
                ket = "A";
            } else if (nilai >= 71 && nilai <= 80) {
                ket = "B";
            } else if (nilai >= 61 && nilai <= 70) {
                ket = "C";
            } else if (nilai >= 60 && nilai <=0) {
                ket = "D";
            }
            System.out.println("\t"+ket);
            total = total + nilai;
        }
        System.out.println("rata rata nilai= " + total / 5);
    }
}
