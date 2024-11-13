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
public class Latihan09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, z;
        int a = 3;

        System.out.print("x: ");
        x = sc.nextInt();

//        System.out.println("z = x * a++ = " + (x * a++));
//        System.out.println("z = x * ++a = " + x * ++a);
//        System.out.println("z = x * a-- = " + x * a--);
        System.out.println("z = x * --a = " + x * --a);

    }

}
