package pertemuan2;
import java.util.Scanner;

/**
 * StudiKasus2Modifikasi
 */
public class StudiKasus2Modifikasi {

    public static void main(String[] args) {
      int panjangTanah,luasTaman, luasTanah, panjangSisi, diameter, lebarTanah;
      double luasTanahTakTerpakai;
      double jariJari;
      double luasKolam;
      
      Scanner galih = new Scanner(System.in);
      
      System.out.println("masukkan panjang tanah : ");
      panjangTanah = galih.nextInt();
System.out.println("masukkan lebar tanah : " );
lebarTanah = galih.nextInt();
System.out.println("Masukkan luas tanah : " );
luasTanah = galih.nextInt();
luasTanah = panjangTanah * lebarTanah;

            
      System.out.println("masukkan diameter");
      diameter = galih.nextInt();
    jariJari = diameter/2;
      System.out.println("jari-jari : "+jariJari);
       luasKolam = 3.14 * jariJari * jariJari;
      System.out.println("luas kolam : "+luasKolam);
      System.out.println("masukkan panjang sisi : ");
      panjangSisi = galih.nextInt();
      luasTaman = panjangSisi * panjangSisi;
      System.out.println("luas taman : "+luasTaman);
     luasTanahTakTerpakai = luasTanah-luasKolam-luasTaman;
      System.out.println("luas tanah tak terpakai : "+luasTanahTakTerpakai);
      galih.close();
    }
}
