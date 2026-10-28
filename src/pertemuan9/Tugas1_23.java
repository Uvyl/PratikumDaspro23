//Harga per-tiket :  40000 + (23 mod 6) × 2000 = 50.000
//Syarat diskon pertama :  lebih dari (3 + (23 mod 3)) = lebih dari 5 tiket
//dengan diskon (8 + (23 mod 5))% = diskon 11%
//Syarat diskon kedua:  lebih dari (8 + (23 mod 4)) = 11 tiket
//dengan diskon (15 + (23 mod 4))% =  18%
package pertemuan9;

import java.util.Scanner;

public class Tugas1_23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);
    int hargaTiket = 50000, totalTiket = 0;
    double totalPenjualan = 0; 
    int jumlahTiket;
    double diskon;
    double potonganDiskon;
    double hargaAwal;
    double hargaAkhir;

while (true) {
    System.out.println("masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
    jumlahTiket = galih.nextInt();

    if (jumlahTiket < 0) {
        System.out.println("jumlah tiket tidak boleh negatif, silahkan ulangi");
        continue;
        }
    if (jumlahTiket == 0) {
        break;
    }
    hargaAwal = jumlahTiket * hargaTiket;

      if (jumlahTiket > 5 && jumlahTiket <11) {
        diskon = 0.11;
    } else if (jumlahTiket > 11) {
        diskon = 0.18;
    }else{
        diskon = 0;
    }
    potonganDiskon = hargaAwal * diskon;
    hargaAkhir = hargaAwal - potonganDiskon;

    System.out.println("Harga awal : Rp " +hargaAwal);
    System.out.println("diskon(dalam persen) : " +diskon *100 +potonganDiskon);
    System.out.println("Total bayar : Rp " +hargaAkhir);

    totalTiket += jumlahTiket;
    totalPenjualan += hargaAkhir;
    
    } 
    System.out.println("total tiket yang terjual : " +totalTiket);
    System.out.println("total penjualan : Rp" +totalPenjualan);
    galih.close();
    }
}
    
