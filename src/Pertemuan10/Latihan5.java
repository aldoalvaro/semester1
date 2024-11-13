package Pertemuan10;
public class Latihan5 {
    public static void main(String[] args) {
        int i = 1990;
        System.out.println("deret tahun kabisat: ");
        while (i <= 2024) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }i++;
        }
    }
}
