/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB282
 */
public class haha {
    static int[] c;

    public static void main(String[] args) {
        int posisi;
        String cari;
        int banyak = Integer.parseInt(JOptionPane.showInputDialog("Hallo Bapak/Ibu Guru! \nSilahkan Masukkan Banyak Siswa: "));
        haha.c = new int[banyak];

        for (int i = 0; i < c.length; i++) {
            String siswaMapel = JOptionPane.showInputDialog("Masukkan Nama Siswa dan Mata Pelajaran: ");
            int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Siswa: "));
            c[i] = input;
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(c));
        cari = JOptionPane.showInputDialog("Masukkan Nama Siswa yang akan dicari: ");
        posisi = search(cari, c.length);

        if (posisi == -1) {
            JOptionPane.showMessageDialog(null, "Nama tidak ditemukan!");
        } else {
            JOptionPane.showMessageDialog(null, "Namaditemukan!");
        }
    }

    public static int search(int b, int n) {
        int flag = 0;
        int awal = 0;
        int akhir = 0;
        int nt = 0;
        int pos = 0;
        akhir = n - 1;

        do {
            nt = (int) ((b - c[awal]) / (c[akhir] - c[awal]) * (akhir - awal) + awal);
            if (c[nt] == b) {
                return nt;
            } else if (b < c[nt]) {
                akhir = nt - 1;
            } else {
                awal = nt + 1;
            }
        } while (b >= c[awal] && b <= c[akhir]);
        return -1;
    }

    private static int search(String cari, int length) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

