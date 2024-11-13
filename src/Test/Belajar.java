/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class Belajar {
    
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai alas: "));
        int t = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai tinggi: "));
        double luas = 0.5 * a * t;
        JOptionPane.showMessageDialog(null, luas);
        
    }
    
}
