package pertemuan2;
import java.util.Scanner;

public class StudiKasus1modifikasi {
    public static void main(String[] args) {

Scanner galih = new Scanner(System.in);

    int jumlahAnak;
    int gajiPokok;
    int tunjangan = 100000;
    double potonganGaji = 0.1;
    int jumlahTunjangan;

    System.out.println("masukkan gaji pokok : ");
    gajiPokok = galih.nextInt();
System.out.println("masukkan jumlah anak : ");
jumlahAnak = galih.nextInt();
System.out.println("masukkan jumlah tunjangan : " );
jumlahTunjangan = galih.nextInt();

jumlahTunjangan = jumlahAnak + tunjangan;

    System.out.println("gaji bersih : "+gajiPokok*jumlahTunjangan+potonganGaji); 
    galih.close();
  
}

}
    

