package pertemuan3;
import java.util.Scanner;
public class GajiKaryawan23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);
        int gajiPokok;
        double bonus;
        int totGaji;
        double tunjTransp=600000;
        double tunjMkn=400000;
gajiPokok=galih.nextInt();
bonus= 0.05*gajiPokok;
totGaji=(int) (gajiPokok+tunjTransp+tunjMkn+bonus-(0.*gajiPokok));
System.out.println("bonus bulanan anda adalah Rp. "+bonus);
System.out.println("Gaji yang diterima adalah Rp. "+totGaji);

galih.close();

    }
}
