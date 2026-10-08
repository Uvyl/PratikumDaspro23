package pertemuan3;
import java.util.Scanner;
public class CicilanLaptop23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);
        int harga, uangMuka, lamaDicicil, uangKurang, CicilanPokok;
        double bunga = 0.02, cicilanPerbulan;

System.out.println("harga Laptop Rp. : ");
harga = galih.nextInt();
System.out.println("Uang Muka Rp. : ");
uangMuka = galih.nextInt();
System.out.println("lama menyicil : ");
lamaDicicil = galih.nextInt();
uangKurang = harga-uangMuka;
CicilanPokok = uangKurang/lamaDicicil;
bunga = uangKurang * bunga;
cicilanPerbulan = CicilanPokok + bunga;
System.out.println("cicilan pokok : "+cicilanPerbulan);
galih.close();



    }
}
