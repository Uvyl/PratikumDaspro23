package pertemuan6;
import java.util.Scanner;
public class tugas1DiskonBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diskonKamus = 11;
        int batasKamus = 3;
        int diskonNovel = 8;
        int batasNovel = 4;
        int diskonLain = 6;
        int batasLain = 4;
        int diskon;

        System.out.println("jenis buku : ");
        String jenisBuku = sc.nextLine();
        System.out.println("jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        boolean isKamus = jenisBuku.equalsIgnoreCase("kamus");
        boolean isNovel= jenisBuku.equalsIgnoreCase("novel");
  
        if (isKamus && jumlahBuku > batasKamus) {
            diskon = diskonKamus + 2;
        } else if (isKamus) {
            diskon = diskonKamus;
        } else if ( isNovel && jumlahBuku > batasNovel) {
            diskon = diskonNovel + 2;
        } else if (isNovel) {
            diskon = diskonNovel + 1;
        } else if (!isKamus && !isNovel && jumlahBuku > batasLain) {
            diskon = diskonLain;
        }else{
            diskon = 0;
        } 
            
        System.out.println("diskon: " + diskon + "%");
        sc.close();
    }    
}
