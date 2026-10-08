package pertemuan2;

public class StudiKasus2 {
    public static void main(String[] args) {
      int panjangTanah = 100;
      int lebarTanah = 30;
      int diameter = 5;
      int panjangSisi = 2;
      double luasTanahTakTerpakai;
      double jariJari;
      double luasKolam;
      int luasTanah;
      int luasTaman;
      
            luasTanah = panjangTanah * lebarTanah;
      System.out.println("luas tanah : " +luasTanah);
    jariJari = diameter/2;
      System.out.println("jari-jari : "+jariJari);
       luasKolam = 3.14 * jariJari * jariJari;
      System.out.println("luas kolam : "+luasKolam);
      luasTaman = panjangSisi * panjangSisi;
      System.out.println("luas taman : "+luasTaman);
     luasTanahTakTerpakai = luasTanah-luasKolam-luasTaman;
      System.out.println("luas tanah tak terpakai : "+luasTanahTakTerpakai);
      
      
    }
}
