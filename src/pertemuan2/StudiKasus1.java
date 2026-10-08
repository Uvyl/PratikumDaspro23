package pertemuan2;

public class StudiKasus1 {
public static void main(String[] args) {
    
    int jumlahAnak = 4;
    double Tunjangan = 1000.00;
    int gajiPokok = 5000000;
    double potonganGaji = 0.1;
    double jumlahTunjungan = jumlahAnak+Tunjangan;
System.out.println("jumlah tunjangan : "  +jumlahTunjungan);
    System.out.println("gaji bersih : " + gajiPokok*potonganGaji+jumlahTunjungan);
}
}
