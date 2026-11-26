import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] daftarNama = {"Muchlis", "Ahmad", "Zora", "MBG", "Asri"};

        System.out.println("=== PENCARIAN NAMA ===");
        System.out.print("Masukkan nama yang dicari: ");
        String cariNama = input.nextLine();

        boolean ketemu = false;

        for (String nama : daftarNama) {
            if (nama.equalsIgnoreCase(cariNama)) {
                ketemu = true;
                break;
            }
        }

        if (ketemu) {
            System.out.println("Nama " + cariNama + " ada dalam daftar!");
        } else {
            System.out.println("Nama " + cariNama + " tidak ditemukan.");
        }
    }
}
