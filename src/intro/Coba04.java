/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class Coba04 {

    public static void main(String[] args) {
        double alas;
        double tinggi;
        double luas;

        Scanner sc = new Scanner(System.in);

        System.out.print("alas: ");
        alas = sc.nextDouble();

        System.out.print("tinggi: ");
        tinggi = sc.nextDouble();

        luas = (double) (alas * tinggi) / 2;
        System.out.println("Luas Segitiga: " + luas);
    }

}
