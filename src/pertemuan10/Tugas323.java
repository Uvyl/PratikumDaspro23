//parameter unik jumlah toko = 2 +(23 mod 3) = 4
package pertemuan10;

import java.util.Scanner;

public class Tugas323 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko = ");
        int jumlahToko = galih.nextInt();

        if (jumlahToko < 1) {
            System.out.println("jumlah toko harus minimal 1");
        } else {
            int totalSemuaToko = 0;
            int barangTerbanyak = -1;
            int tokoTerbaik = 0;

            for (int toko = 1; toko <= jumlahToko; toko++) {
                
                int jumlahPelanggan;
                do {
                    System.out.print("Jumlah pelanggan: ");
                    jumlahPelanggan = galih.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println(" Tidak boleh negatif. Ulangi lagi");
                    }
                } while (jumlahPelanggan <0);
                int totalBarangToko = 0;
                
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print(" Jumlah barang pelanggan " + p + ": ");
                        barang = galih.nextInt();
                        if (barang < 0) {
                            System.out.println("tidak boleh negatif. ulangi");
                        }
                    } while (barang <0);
                    totalBarangToko += barang;
                }
                totalSemuaToko += totalBarangToko;
                System.out.println("Toko" + toko + "- pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbaik = toko;
                }
            }
            System.out.println("===============================");
            System.out.println("Total barang seluruh toko: " + totalSemuaToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        }
        galih.close();
    }
}
