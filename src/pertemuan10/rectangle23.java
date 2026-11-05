// Parameter unik Langkah 9 uji ke 1 (baris dan kolom): (2 + (23 mod 3) , 4 + (23 mod 3)) = 4 dan 6
// Parameter unik Langkah 9 uji ke 2 (baris dan kolom): (5 + (23 mod 3), 2 + (23 mod 3)) = 7 dan 4
// Parameter unik pertanyaan 2 (baris dan kolom) : 4 + (23 mod 4), 6 + (23 mod 4) = 7 dan 9
package pertemuan10;

import java.util.Scanner;

public class rectangle23 {
    public static void main(String[] args) {
    Scanner galih = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris: ");
    int baris = galih.nextInt();
    System.out.print("Masukkan jumlah kolom: ");
    int kolom = galih.nextInt();

    for (int i = 1; i <= baris; i++) {
        for (int j = 1; j <= kolom; j++) {
        System.out.print("#");
    }
    System.out.println();
        
    }
    galih.close();
    }
 
}
