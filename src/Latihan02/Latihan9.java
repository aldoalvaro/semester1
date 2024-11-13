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
public class Latihan9 {

    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan bil 1: ");
        a = sc.nextInt();
        System.out.print("masukkan bil 2: ");
        b = sc.nextInt();
        System.out.print("masukkan bil 3: ");
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("bilangan terbesar adalah " + a);
        } else if (b > a && b > c) {
            System.out.println("bilangan terbesar adalah " + b);
        } else {
            System.out.println("bilangan tebesar adalah " + c);

        }

    }
}
