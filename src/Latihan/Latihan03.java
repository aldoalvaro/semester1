/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class Latihan03 {

    public static void main(String[] args) {
        int a;
        int total;
        String lagi;

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai a: ");
        a = sc.nextInt();

        total = (int) (Math.pow(a, 2) + Math.pow(a, 3) + Math.pow(a, 4) + Math.pow(a, 5));
        System.out.println("maka hasil dari " + a + "^2+" + a + "^3+" + a + "^4+" + a + "^5+ =" + total);

    }

}
