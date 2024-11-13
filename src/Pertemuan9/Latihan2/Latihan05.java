package Pertemuan9.Latihan2;

import java.util.Scanner;

public class Latihan05 {

    public static void main(String[] args) {
        int i = 1;
        int byk_perkalian, pengali, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("banyak perkalian: ");
        byk_perkalian = sc.nextInt();
        System.out.print("pengali: ");
        pengali = sc.nextInt();
        do {
            total = i * pengali;
            System.out.println(i + " x " + pengali + " = " + total);
            i++;
        } while (i <= byk_perkalian);
    }
}
