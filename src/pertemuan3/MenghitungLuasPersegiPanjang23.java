package pertemuan3;
import java.util.Scanner;
public class MenghitungLuasPersegiPanjang23 {
    public static void main(String[] args) {
        Scanner galih = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;

        panjang = galih.nextInt();
        lebar = galih.nextInt();
        luas= panjang*lebar;
        System.out.println("luas persegi adalah"+luas);
        galih.close();
    }
    
}
