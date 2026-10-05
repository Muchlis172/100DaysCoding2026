import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja Anda (Rp): ");
        int totalBelanja = input.nextInt();

        if (totalBelanja >= 500000) {
            System.out.println("Selamat! Anda mendapatkan diskon 20%.");
        } else if (totalBelanja >= 200000) {
            System.out.println("Selamat! Anda mendapatkan diskon 10%.");
        } else {
            System.out.println("Maaf, Anda tidak mendapatkan diskon.");
        }
    }
}
