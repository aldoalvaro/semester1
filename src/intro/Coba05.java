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
public class Coba05 {

    public static void main(String[] args) {
        double r;
        double phi = 3.14;
        double luas;

        Scanner sc = new Scanner(System.in);

        System.out.print("jari-jari: ");
        r = sc.nextDouble();

        luas = (double) r * r * phi;
        System.out.println("Luas lingkaran: " + luas);

    }

}
