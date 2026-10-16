import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng (Rp 15.000)");
        System.out.println("2. Mie Ayam (Rp 12.000)");
        System.out.println("3. Ayam Bakar (Rp 20.000)");
        System.out.print("Pilih nomor menu (1-3): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jumlah porsi: ");
        int jumlah = input.nextInt();

        int hargaPerPorsi = 0;
        String namaMenu = "";

        switch (pilihan) {
            case 1:
                namaMenu = "Nasi Goreng";
                hargaPerPorsi = 15000;
                break;
            case 2:
                namaMenu = "Mie Ayam";
                hargaPerPorsi = 12000;
                break;
            case 3:
                namaMenu = "Ayam Bakar";
                hargaPerPorsi = 20000;
                break;
            default:
                System.out.println("Pilihan menu tidak tersedia!");
        }

        if (hargaPerPorsi > 0) {
            int totalBayar = hargaPerPorsi * jumlah;
            System.out.println("Total yang harus dibayar untuk " + namaMenu + " adalah Rp " + totalBayar);
        }
    }
}
