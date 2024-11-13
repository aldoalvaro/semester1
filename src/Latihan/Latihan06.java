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
public class Latihan06 {

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai a: ");
        a = sc.nextInt();

        System.out.print("masukkan nilai b: ");
        b = sc.nextInt();

        System.out.println("\nFungsi AND");
        System.out.println("(a > b) && (a >= b): " + ((a > b) && (a >= b)));
        System.out.println("(a > b) && (a < b): " + ((a > b) && (a < b)));
        System.out.println("(a == b) && (a >= b): " + ((a == b) && (a >= b)));
        System.out.println("(a != b) && (a <= b): " + ((a != b) && (a <= b)));

        System.out.println("\nFungsi OR");
        System.out.println("(a > b) || (a >= b): " + ((a > b) || (a >= b)));
        System.out.println("(a > b) || (a < b): " + ((a > b) || (a < b)));
        System.out.println("(a == b) || (a >= b): " + ((a == b) || (a >= b)));
        System.out.println("(a != b) || (a <= b): " + ((a != b) || (a <= b)));

        System.out.println("\nFungsi XOR");
        System.out.println("(a > b) ^ (a >= b): " + ((a > b) ^ (a >= b)));
        System.out.println("(a > b) ^ (a < b): " + ((a > b) ^ (a < b)));
        System.out.println("(a == b) ^ (a >= b): " + ((a == b) ^ (a >= b)));
        System.out.println("(a != b) ^ (a <= b): " + ((a != b) ^ (a <= b)));

        System.out.println("\nTerima Kasih!");
    }
}
