package pertemuan6;
import java.util.Scanner;
public class nestedUjianSkripsi23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String pesan;
        System.out.print("Apakah mahasiswa bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 9 && bimbinganP2 >= 5) {
            pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
        } else if (bimbinganP1 < 9 && bimbinganP2 < 5) {
            pesan = "Gagal! Log bimbimngan P1 kurang dari 9 kali dan P2 kurang dari 5 kali ";
        } else if (bimbinganP1 < 9) {
            pesan = "Gagal! Log bimbingan P1 kurang dari 9 kali";  
        } else {
            pesan = "Gagal! Log Bimbingan P2 belum mencapai 5 kali";
        }
    } else {
        pesan = "Gagal! mahasiswa masih memiliki tanggungan kompen";
    }
    System.out.println(pesan);
    sc.close();
    } 
}
         
    

