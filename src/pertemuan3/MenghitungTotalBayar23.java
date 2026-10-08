package pertemuan3;
import java.util.Scanner;
public class MenghitungTotalBayar23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);
        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;
harga=galih.nextInt();
potongan=diskon*harga;
jml_bayar=harga-potongan;
System.out.println("jumlah yang harus anda bayar adalah Rp, "+jml_bayar);
galih.close();
    }
    
}
