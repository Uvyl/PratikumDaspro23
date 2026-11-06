// parameter unik n = (6 + (23 mod 5)) = 9
package pertemuan10;

import java.util.Scanner;

public class Tugas123 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);

        System.out.print("Masukkan n = ");
        int n = galih.nextInt();

        if (n < 1) {
            System.out.println("n harus minimal 1");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(j +" ");
                    total++;
                    
                }
                System.out.println();
            }
            System.out.println("Total angka yang tercetak = " + total);
        }
        galih.close();
    }
}
