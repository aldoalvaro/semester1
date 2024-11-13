package Pertemuan10;
public class Latihan4 extends Latihan5 {
    public static void main(String[] args) {
        System.out.println("tahun kabisat dari tahun 2000 hingga 2024 adalah ");
        for (int i = 1990; i <= 2024; i++) {
            if (i % 4 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}
