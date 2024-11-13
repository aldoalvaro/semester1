/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan10;

import java.util.Scanner;

/**
 *
 * @author LAB282
 */
public class Latihan10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil,terbesar=0,i = 1;
        while(i<=5) {
            System.out.print("inputkan bilangan ke-"+i+ ": ");
            bil = sc.nextInt();
            i++;
            if (bil > terbesar){
                terbesar = bil;
           
        }
        }System.out.println("bilangan terbesar adalah: "+terbesar);
        }
    }

