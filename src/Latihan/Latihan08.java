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
public class Latihan08 {

    public static void main(String[] args) {
        String username = "admin";
        int password = 1234;
        String user;
        int pass;
        boolean check;

        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        user = sc.next();
        System.out.print("Password: ");
        pass = sc.nextInt();

        check = (username.equals(user) || (password == pass));

        System.out.println("Akses boleh lah " + check);

    }
}
