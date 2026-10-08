package pertemuan6;
import java.util.Scanner;
public class operatorLogikaWifi23 {
    public static void main(String[] args) {
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;
        Scanner sc = new Scanner (System.in);

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();
        
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();
        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WIFI DIBERIKAN");
        } else {
            System.out.println("Akses WIFI ditolak");
        }
        sc.close();
    }
}
