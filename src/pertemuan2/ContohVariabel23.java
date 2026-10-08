package pertemuan2;

public class ContohVariabel23 {
    public static void main(String[] args) {
        String hobby = "bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umur = 20;
        double ipk = 3.24, tinggi = 1.78;
        System.out.println(hobby);
        System.out.println("apakah pandai?" + isPandai);
        System.out.println("jenis kelamin: " + jenisKelamin );
        System.out.println("umurku saat ini: " + umur);
        System.out.println(String.format("saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}
