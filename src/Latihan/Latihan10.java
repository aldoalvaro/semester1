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
public class Latihan10 {

    public static void main(String[] args) {
        double a, b;
        int c = 3;

        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();

//        System.out.println("1. hasil dari a +=a * b + 11 = " + (a += a * b + 11));
//        System.out.println("2. hasil dari a -=a * b / 4 + 3 =" + (a -= b / 4 + 3));
//        System.out.println("3. hasil dari a /=a + b * 100 = " + (a /= a + b * 100));
//        System.out.println("4. hasil dari a *=a - b % 4 = " + (a *= a - b % 4));
//        System.out.println("5. hasil dari a +=a / b % 3 = " + (a += a / b % 3));
//        System.out.println("6. hasil dari a %=a + b * 10 = " + (a %= a + b * 10));
//        System.out.println("7. hasil dari a +=a * b + c++ = " + (a += a * b + c++));
        System.out.println("8. hasil dari a *=a - b + 151 = " + (a *= a - b + 151));

    }

}
