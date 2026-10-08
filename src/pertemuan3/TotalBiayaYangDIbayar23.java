package pertemuan3;
import java.util.Scanner;
public class TotalBiayaYangDIbayar23 {
    public static void main(String[] args) {
        int banyakLembarDokumen, biayaJilid= 5000, biayaTotalCetak,totalBiaya, biayaCetak = 500;
Scanner galih = new Scanner(System.in);
banyakLembarDokumen=galih.nextInt();

        System.out.println("Jumlah dokumen : "+banyakLembarDokumen);
        biayaTotalCetak = biayaCetak*banyakLembarDokumen;
        System.out.println("biaya total cetak : "+biayaTotalCetak);
        totalBiaya= biayaTotalCetak+biayaJilid;
        System.out.println("total biaya yang harus dibayar adalah : "+totalBiaya);
        galih.close();
    }
    
}
