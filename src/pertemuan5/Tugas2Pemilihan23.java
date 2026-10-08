package pertemuan5;
import java.util.Scanner;
public class Tugas2Pemilihan23 {
    public static void main(String[] args) {
   int jumlahSks;
    Scanner galih = new Scanner(System.in);

    System.out.println("Jumlah SKS");
    jumlahSks = galih.nextInt();
    if (jumlahSks > 24) {
        System.out.print("Melebihi batas");
    } else {
        System.out.println("KRS valid");
    }
    galih.close();
    }
}
