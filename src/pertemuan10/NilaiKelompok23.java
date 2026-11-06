
// Parameter unik jumlahKelompok = 2  + (23 mod 3) = 4
// Parameter unik jumlahPenilai = 3  + (23 mod 2) = 4
package pertemuan10;

import java.util.Scanner;

public class NilaiKelompok23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kelompok : ");
        int jumlahKelompok = galih.nextInt();
        System.out.print("Masukkan Jumlah Penilai : ");
        int jumlahPenilai = galih.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
        System.out.println("Jumlah kelompok dan penilai harus > 0");            
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;
        while (nomorKelompok <= jumlahKelompok) {
            System.out.println("Kelompok " + nomorKelompok);
            double totalNilai = 0;
            for (int j = 1; j <= jumlahPenilai; j++) {
                int nilai;
                do {
                    System.out.print(" Nilai dari penilai " + j + ": ");
                    nilai = galih.nextInt();
                    if (nilai < 0 ||nilai > 100) {
                        System.out.println("Nilai harus 0-100. Ulangi input");
                    }
                } while (nilai < 0 || nilai > 100);
                totalNilai += nilai;          
            }   
            double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTerbaik = nomorKelompok;
            }
            nomorKelompok++;
        }
        System.out.println("=================================");
        System.out.println("Kelompok terbaik    : " +kelompokTerbaik);
        System.out.println("Rata-rata tertinggi : " +rataTertinggi);
        }
    }
}
