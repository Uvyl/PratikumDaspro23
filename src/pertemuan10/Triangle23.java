// Parameter unik n langkah 3 = 2 + (23 mod 3) = 4
package pertemuan10;

import java.util.Scanner;

public class Triangle23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = galih.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        galih.close();
    }
}
