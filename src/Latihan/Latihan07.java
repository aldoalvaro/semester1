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
public class Latihan07 {

    public static void main(String[] args) {
        int a;
        boolean status;

        Scanner sc = new Scanner(System.in);

        System.out.print("bilangan: ");
        a = sc.nextInt();

        status = (a >= 1 && a <= 10);
        System.out.println("valid? " + status);

    }

}
