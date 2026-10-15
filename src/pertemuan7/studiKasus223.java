package pertemuan7;
import java.util.Scanner;
public class studiKasus223 {
    public static void main(String[] args) {
    Scanner galih = new Scanner(System.in);
    int peringkatJuara = 0;
    int jumlahDokumen = 0;
    int statusPendanaan = 0;
    System.out.println("nama mahasiswa: ");
    String namaMahasiswa = galih.nextLine();
    System.out.println("Jenis kegiatan (BALMAWA/BAKORMA/Mandiri/PKM/Lainnya");
    String jenisKegiatan = galih.next();
    
    

    if (jenisKegiatan.equalsIgnoreCase("BALMAWA")) {
        System.out.println("peringkat juara (0 jika bukan juara)");
       peringkatJuara = galih.nextInt();
       if (peringkatJuara >= 1 && peringkatJuara <= 3) {
        System.out.println("jumlah dokumen yang di upload (0-4)");
        jumlahDokumen = galih.nextInt();
        if (jumlahDokumen == 4) {
            System.out.println("Status Dana: DIBERIKAN");
            System.out.println("alasan juara: " + peringkatJuara + "dan dokumen lengkap");
        } else {
            System.out.println("Status Dana: TIDAK DIBERIKAN ");
            System.out.println("Alasan: Dokumen tidak lengkap, kurang " + (4-jumlahDokumen) + "dokumen");
        }
       } else {
        System.out.println("Status dana: TIDAK DIBERIKAN");
        System.out.println("Alasan: bukan juara 1,2, atau 3");
       }
    }
    else if (jenisKegiatan.equalsIgnoreCase("BAKORMA")) {
        System.out.println("peringkat juara (0 jika bukan juara)");
        peringkatJuara = galih.nextInt();
       if (peringkatJuara >= 1 && peringkatJuara <= 3) {
        System.out.println("jumlah dokumen yang di upload (0-4)");
        jumlahDokumen = galih.nextInt();
        if (jumlahDokumen == 4) {
            System.out.println("Status Dana: DIBERIKAN");
            System.out.println("alasan juara: " + peringkatJuara + "dan dokumen lengkap");
        } else {
            System.out.println("Status Dana: TIDAK DIBERIKAN ");
            System.out.println("Alasan: Dokumen tidak lengkap, kurang " + (4-jumlahDokumen) + "dokumen");
        }
       } else {
        System.out.println("Status dana: TIDAK DIBERIKAN");
        System.out.println("Alasan: bukan juara 1,2, atau 3");
       }
    }
    else if (jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
     System.out.println("peringkat juara (0 jika bukan juara)");
        peringkatJuara = galih.nextInt();
       if (peringkatJuara >= 1 && peringkatJuara <= 3) {
        System.out.println("jumlah dokumen yang di upload (0-4)");
        jumlahDokumen = galih.nextInt();
        if (jumlahDokumen == 4) {
            System.out.println("Status Dana: DIBERIKAN");
            System.out.println("alasan juara: " + peringkatJuara + "dan dokumen lengkap");
        } else {
            System.out.println("Status Dana: TIDAK DIBERIKAN ");
            System.out.println("Alasan: Dokumen tidak lengkap, kurang " + (4-jumlahDokumen) + "dokumen");
        }
       } else {
        System.out.println("Status dana: TIDAK DIBERIKAN");
        System.out.println("Alasan: bukan juara 1,2, atau 3");
       }
    }else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
    System.out.println("Status Pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
    statusPendanaan = galih.nextInt();
    if (statusPendanaan == 1) {
        System.out.println("jumlah dokumen yang diupload (0-4)");
        jumlahDokumen = galih.nextInt();
        if (jumlahDokumen == 4) {
            System.out.println("Status Dana: DIBERIKAN");
            System.out.println("Alasan: PKM lolos dan dokumen lengkap");
        } else {
            System.out.println("Status Dana: TIDAK DIBERIKAN");
            System.out.println("Alasan: Dokumen tidak lengkap, kurang " +(4 - jumlahDokumen) + "dokumen");
        }
    } else {
        System.out.println("Status Dana: Tidak diberikan");
        System.out.println("Alasan: Dokumen tidak lengkap, kurang " +(4-jumlahDokumen) + "dokumen");
    }
} else {
    System.out.println("Status Dana: Tidak diberikan ");
    System.out.println("Alasan: Kegiatan termasuk kategori lainnya");
}
galih.close();
    }
}
