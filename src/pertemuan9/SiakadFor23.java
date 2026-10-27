//parameter unik i: 8 + (23 mod 5) = 11
//parameter unik nomor 4: 55 + (23 mod 11) = 56
package pertemuan9;

import java.util.Scanner;

public class SiakadFor23 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      double nilai, tertinggi = 0, terendah = 100;
      int jumlahLulus = 0, jumlahTdklulus = 0;

      for (int i = 1; i <=11 ; i++) {
       System.out.print("Masukkan nilai  mahasiswa ke- "+ i + ": ");
       nilai = sc.nextDouble();
       if (nilai > tertinggi) {
        tertinggi = nilai;
        
       } 
       if (nilai < terendah) {
        terendah = nilai;
       }
       if (nilai >=56) {
         jumlahLulus++;
       } else {
         jumlahTdklulus++;
       }
      }
      System.out.println("Nilai Tertinggi: " +tertinggi);
      System.out.println("Nilai Terendah: " + terendah);
      System.out.println("Jumlah Mahasiswa lulus: " +jumlahLulus);
      System.out.println("Jumlah Mahasiswa tidak lulus: " +jumlahTdklulus);
      sc.close();
   } 
}