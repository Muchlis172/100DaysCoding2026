import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah dia menyukaimu? (iya/tidak) : ");
        String nilai = input.next();

        System.out.print("Apakah orang tuanya merestui? (iya/tidak) : ");
        String kehadiran = input.next();

        if (nilai.equalsIgnoreCase("iya")) {
            if (kehadiran.equalsIgnoreCase("iya")) {
                System.out.println("Hasil: Selamat! Anda Sangat Beruntung.");
            } else {
                System.out.println("Hasil: Yang Sabar ya.");
            }
        } else {
            System.out.println("Hasil: Wanita Masih Banyak Yang Menunggu.");
        }
    }
}
