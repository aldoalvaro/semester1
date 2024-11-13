/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan02;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class Latihan10 {

    public static void main(String[] args) {
        String gender;
        int usia;

        Scanner sc = new Scanner(System.in);
        System.out.print("Gender (L/P): ");
        gender = sc.next();
        System.out.print("Masukkan usia anda: ");
        usia = sc.nextInt();

        if (!"L".equalsIgnoreCase(gender) && !"P".equalsIgnoreCase(gender)) {
            System.out.println("Gender tidak terdeteksi");
        } else if ("L".equalsIgnoreCase(gender) && usia < 20) {
            System.out.println("Laki-laki remaja");
        } else if ("P".equalsIgnoreCase(gender) && usia < 20) {
            System.out.println("Perempuan remaja");
        } else {
            System.out.println("Dewasa");
        }
    }

}
