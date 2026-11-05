// Parameter unik untuk Langkah 10  pertama : n = (3 + (23 mod 5)) :  n = 6
// Parameter unik untuk Langkah 10 kedua : n = (9 + (23 mod 5)) : n = 11
package pertemuan10;

import java.util.Scanner;

public class star23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = galih.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        galih.close();
    }
}
