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
public class Coba03 {

    public static void main(String[] args) {
//        blok deklarasi
        double panjang;
        double lebar;
        double luas;

//        blok input
        Scanner sc = new Scanner(System.in);

        System.out.print("panjang: ");
        panjang = sc.nextInt();

        System.out.print("lebar: ");
        lebar = sc.nextInt();

//        blok proses
        luas = panjang * lebar;

//        blok output
        System.out.println("luas: " + luas);
    }
}
