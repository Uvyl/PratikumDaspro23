package pertemuan5;
import java.util.Scanner;

public class  Tugas1Pemilihan23{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" --- CETAK SIAKAD KRS ---");
        System.out.println("Apakah UKT sudah lunas? (true/false)");
        boolean uktLunas = sc.nextBoolean();
        String pesan;


        pesan = (uktLunas) ? "pembayaran UKT terverifikasi. Silahkan cetak KRS dan minta tanda tangan DPA" : "registrasi ditolak. Silahkan lunasi UKT";
        System.out.println(pesan);
        sc.close();
    }
}