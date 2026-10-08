package pertemuan6;
import java.util.Scanner;
public class nestedAksesLab23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.println("apakah pengguna mahasiswa aktif?: ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.println("apakah sedang terkena sanksi?: ");
        sedangDisanksi = sc.nextBoolean();

        System.out.println("Apakah memiliki izin dosen?: ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.println("apakah pengguna adalah asisten lab?:  ");
        asistenLab = sc.nextBoolean();
        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
            System.out.println("akses ditolak: membutuhkan izin dosen atau status asisten lab");
        } 
    } else {
        System.out.println("akses ditolak: status mahasiswa tidak memnuhi syarat");
    }
    sc.close();
    }
}