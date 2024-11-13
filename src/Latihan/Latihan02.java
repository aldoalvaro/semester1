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
public class Latihan02 {

    public static void main(String[] args) {
        double celcius;
        double fahrenheit;

        Scanner sc = new Scanner(System.in);
        System.out.print("Celcius: ");
        celcius = sc.nextInt();

        System.out.println("diubah ke fahrenheit");

        fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println("Fahrenheit :" + fahrenheit);

    }

}
