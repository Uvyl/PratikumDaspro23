package pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsisten23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minNilaiDaspro = 76;
        int minNilaiWawancara = 71;

        System.out.println("mahasiswa berstatus aktif?: ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.println("sedang mendapat sanksi akademik?:");
        boolean sanksi = sc.nextBoolean();
        System.out.println("nilai dasar pemograman: ");
        int nilaiDaspro = sc.nextInt();
        System.out.println("punya sertifikat pemograman?: ");
        boolean sertifikat = sc.nextBoolean();
        System.out.println("nilai wawancara: ");
        int nilaiWawancara = sc.nextInt();
        
        if (mahasiswaAktif && !sanksi) {

            if (nilaiDaspro >= minNilaiDaspro || sertifikat) {

                if (nilaiWawancara >= minNilaiWawancara){
                    System.out.println("diterima!");{
                }
            } else {
            System.out.println("gagal di tahap wawancara: nilai wawancara" +nilaiWawancara);
            } 
        }else {
                System.out.println("gagal di tahap kompetensi: nilai daspro"+nilaiDaspro);
        } 
        
    }else

    {
        System.out.println("Gagal di tahap administrasi:");
        if (!mahasiswaAktif) {
            System.out.println("- Mahasiswa tidak berstatus aktif.");
        }
        if (sanksi) {
            System.out.println("- Mahasiswa sedang mendapat sanksi akademik.");
        }
    }sc.close();
}}
