//tarif parkir mobil = 2500 + (23 mod 6) × 250 per jam = 3750
//tarif parkir motor = 1500 + (23 mod 6) × 250 per jam = 2750
package pertemuan9;

import java.util.Scanner;

public class Tugas2_23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.println("masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk selesai: ");
        jenis = galih.nextInt();
            if (jenis == 0) {
                System.out.println("selesai");
                break;
            }
        if (jenis == 1 || jenis == 2) {
            System.out.println("Durasi parkir: ");
            durasi = galih.nextInt();
            if (jenis == 1) {
                total += durasi * 3750;
            } else{
                total += durasi * 2750;
     
            }
        }
             
        } while (jenis !=0);
        System.out.println("total biaya parkir: " +total);
        galih.close();
    }
}
