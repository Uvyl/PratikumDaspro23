package pertemuan5;
import java.util.Scanner;
public class TugasAntrean23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner (System.in);
        char kode;
        
        System.out.println("masukkan kode");
        kode = galih.next().charAt(0);
        switch (kode) {
            case '1': 
            
                System.out.println("legalisir ijazah");
                System.out.println("Loket A");
                break;
            case '2' :
                System.out.println("Surat Keterangan aktif kuliah");
                System.out.println("Loket B");
                break;
            case '3' :
                System.out.println("Pembayaran UKT");
                System.out.println("Loket C");
                break;
            case '4' :
                System.out.println("Pengajuan Cuti Akademik");
                System.out.println("Loket D");
                break;
            default:
                System.out.println("kode layanan tidak tersedia");
                break;
                
        }
        galih.close();
    }
}
