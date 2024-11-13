/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class Coba06 {

    public static void main(String[] args) {
        String nama;
        double nilaiUTS;
        double nilaiUAS;
        double RataRata;
        boolean status;

        nama = JOptionPane.showInputDialog("nama? ");
        System.out.println("Halo " + nama);

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        RataRata = (nilaiUTS + nilaiUAS) / 2;
        System.out.println("Nilai rata-rata anda adalah: " + RataRata);

        status = RataRata > 60;
        System.out.println("Lulus: " + status);

    }

}
