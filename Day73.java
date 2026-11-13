import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int totalBayar = 0;

        do {
            System.out.println("\n=== APLIKASI KEDAI STOIK ===");
            System.out.println("1. Roti Bakar  - Rp 15.000");
            System.out.println("2. Kentang Goreng  - Rp 12.000");
            System.out.println("3. Kopi Panas - Rp  5.000");
            System.out.println("4. Hitung Total & Selesai");
            System.out.print("Pilih menu (1-4): ");
            
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("-> Nasi Goreng ditambahkan.");
                    totalBayar += 15000;
                    break;
                case 2:
                    System.out.println("-> Mie Ayam ditambahkan.");
                    totalBayar += 12000;
                    break;
                case 3:
                    System.out.println("-> Es Teh Manis ditambahkan.");
                    totalBayar += 5000;
                    break;
                case 4:
                    System.out.println("\n=========================");
                    System.out.println("Total Belanja Anda: Rp " + totalBayar);
                    System.out.println("Terima kasih sudah memesan!");
                    System.out.println("=========================");
                    break;
                default:
                    System.out.println("-> Menu tidak tersedia! Silakan pilih nomor 1 sampai 4.");
            }

        } while (pilihan != 4);

    }
}
