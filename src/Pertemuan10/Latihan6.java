package Pertemuan10;
public class Latihan6 {
    public static void main(String[] args) {
        int i = 1990;
        System.out.println("deret tahun kabisat: ");
        do {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }i++;
        } while (i <= 2024);
    }
}
