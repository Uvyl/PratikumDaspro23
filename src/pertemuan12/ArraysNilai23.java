package pertemuan12;

import java.util.Scanner;

public class ArraysNilai23 {
    public static void main(String[] args) {
        int nilaiAkhir [] = new int[10];
        int jumlahLulus = 0;
        int jumlahTdkLulus = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilaiAkhir.length; i++) {
    System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
    nilaiAkhir[i] = input.nextInt();
    }
    for (int i = 0; i < nilaiAkhir.length; i++) {
    String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
    System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" +
    status + ")");
    if (nilaiAkhir[i] > 70) {
        jumlahLulus++;
    } else{
        jumlahTdkLulus++;
    }
    System.out.println("Jumlah mahasiswa yang lulus : " + jumlahLulus);
    System.out.println("Jumlah Mahasiswa yang Tidak Lulus : " + jumlahTdkLulus);
        }
        input.close();
    }
}
