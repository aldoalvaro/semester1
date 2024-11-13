import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menentukan ukuran array melalui input pengguna
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        
        // Membuat array dengan ukuran yang ditentukan
        int[] array = new int[n];
        
        // Mengambil input untuk setiap elemen array menggunakan do-while
        int i = 0;
        do {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        } while (i < n); // Loop akan berlanjut hingga array terisi
        
        // Menampilkan hasil array
        System.out.println("\nIsi array yang dimasukkan:");
        for (int j = 0; j < n; j++) {
            System.out.print(array[j]+ " ");
        }
        
        scanner.close();
    }
}

