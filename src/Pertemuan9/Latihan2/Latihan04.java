package Pertemuan9.Latihan2;

import java.util.Scanner;

public class Latihan04 {

    public static void main(String[] args) {
        int bil, total = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("inputkan bilangan:");
        bil = sc.nextInt();
        while (i <= bil) {
            System.out.print(i + " ");
            total = total + i;
            i++;
        }
        System.out.println("\ntotal bilangan = " + total);
    }
}
