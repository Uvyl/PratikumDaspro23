package pertemuan12;

import java.util.Scanner;

public class Tugas123 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai mahasiswa: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Banyak nilai harus lebih dari 0.");
            input.close();
            return;
        }
        int[] nilai = new int[n];
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        double rata2 = (double) total / nilai.length;
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("\nDaftar nilai dan status:");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        input.close();
    }
}