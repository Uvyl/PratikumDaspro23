package pertemuan5;
import java.util.Scanner;
public class TugasParkir23 {
    public static void main(String[] args) {
        int lamaParkir;
        int tarif = 2000;
        Scanner galih = new Scanner(System.in);
        System.out.println("Lama Parkir :  ");
        lamaParkir = galih.nextInt();
        if (lamaParkir <= 2) {
            tarif = 2000;
            System.out.println(tarif);
        } else {
            tarif = (lamaParkir-2)*1000;
            System.out.println(tarif);
        }
        galih.close();
    } 
}
