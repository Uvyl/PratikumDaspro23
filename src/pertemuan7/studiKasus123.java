package pertemuan7;
import java.util.Scanner;
public class studiKasus123 {
    public static void main(String[] args) {
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        Scanner galih = new Scanner(System.in);

        System.out.print("Jumlah cup: ");
        jumlahCup = galih.nextInt();
        System.out.print("Uang bayar: ");
        uangBayar = galih.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("total Harga:" +totalHarga);
        System.out.println("diskon: "+diskon);
        System.out.println("total bayar: "+totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian: "+kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("uang tidak cukup, kurang Rp." +kurang);
        }
        galih.close();
    }
}