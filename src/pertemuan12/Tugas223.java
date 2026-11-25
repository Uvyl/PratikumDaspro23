package pertemuan12;

import java.util.Scanner;

public class Tugas223 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s Rp %d%n", i + 1, menu[i], harga[i]);
        }
        System.out.print("\nMasukkan nama menu yang dicari: ");
        String cari = input.nextLine();
        int hasil = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari.trim())) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("Menu ditemukan: " + menu[hasil] + ", harga Rp " + harga[hasil]);
        } else {
            System.out.println("Maaf, menu \"" + cari.trim() + "\" tidak tersedia.");
        }
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        if (jumlah <= 0) {
            System.out.println("Jumlah item harus lebih dari 0.");
            input.close();
            return;
        }

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            int idx = -1;
            while (idx == -1) {
                System.out.print("Pesanan ke-" + (i + 1) + ": ");
                String nama = input.nextLine();
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama.trim())) {
                        idx = j;
                        break;
                    }
                }
                if (idx == -1) {
                    System.out.println("Menu tidak tersedia, silakan ulangi.");
                }
            }
            pesanan[i] = menu[idx];
            hargaPesanan[i] = harga[idx];
            total += harga[idx];
        }
        System.out.println("\n=== DAFTAR PESANAN ===");
        System.out.printf("%-4s%-18s%8s%n", "No", "Menu", "Harga");
        System.out.println("------------------------------");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-4d%-18s%8d%n", i + 1, pesanan[i], hargaPesanan[i]);
        }
        System.out.println("------------------------------");
        System.out.printf("%-22s%8d%n", "TOTAL BIAYA", total);

        input.close();
    }
}