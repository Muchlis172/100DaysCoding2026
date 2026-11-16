import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode mahasiswa: ");
        String kodeAwal = input.nextLine(); //" 2023-XYZ-987  "

        String kodeTrim = kodeAwal.trim();
        String kodeReplace = kodeTrim.replace("-", "/");
        String kodeFinal = kodeReplace.substring(0, 9);

        System.out.println("\n=== HASIL PENGOLAHAN KODE ===");
        System.out.println("Kode Awal         : \"" + kodeAwal + "\"");
        System.out.println("Setelah trim()    : \"" + kodeTrim + "\"");
        System.out.println("Setelah replace() : \"" + kodeReplace + "\"");
        System.out.println("Hasil Akhir (9)   : \"" + kodeFinal + "\"");
    }
}
