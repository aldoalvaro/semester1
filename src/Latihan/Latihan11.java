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
public class Latihan11 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        a = sc.nextInt();

        System.out.print("b: ");
        b = sc.nextInt();

        System.out.println("hasil persamaan a&b adalah " + (a & b));
        System.out.println("hasil persamaan a|b adalah " + (a | b));
        System.out.println("hasil persamaan a^b adalah " + (a ^ b));

    }

}
