package pertemuan12;

import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean ditemukan = false;
    System.out.print("Masukkan banyak elemen array: ");
        int n = input.nextInt();
    int[] nilai = new int[n];
     for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari (key): ");
        int key = input.nextInt();
    for (int i = 0; i < nilai.length; i++) {
        if (nilai[i] == key) {
        System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
        ditemukan = true;
        break;
      }
    }
    if (!ditemukan) {
    System.out.println("Nilai yang dicari tidak ditemukan  " + key + " tidak ada dalam array yang berisi " + n + "elemen");
        }
        input.close();
    }
}
   
