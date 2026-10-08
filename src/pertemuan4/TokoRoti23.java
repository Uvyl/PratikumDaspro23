package pertemuan4;
import java.util.Scanner;
public class TokoRoti23 {

    public static void main(String[] args) {
        int hargaRoti=27000;
int modalHarian = 1801250;
int pegawai = 4;
int sisaKas;
int pendapatan;
int laba;
double bagianPegawai;
int jumlahTerbeli;

Scanner galih = new Scanner(System.in);

System.out.println("masukkan jumlah roti dibeli: ");
jumlahTerbeli = galih.nextInt();

bagianPegawai =( jumlahTerbeli*hargaRoti)/pegawai;
System.out.println("bagian yang didapat pegawai : " +bagianPegawai);

pendapatan =(int) jumlahTerbeli*hargaRoti;
System.out.println("pendapatan yang diraih : " +pendapatan);
laba = pendapatan/modalHarian;
System.out.println("laba yang didapatkan : " +laba);

sisaKas = laba-pendapatan;
System.out.println("sisa kas yang tersisa adalah : " +sisaKas);

galih.close();

    }
}