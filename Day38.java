import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== PILIHAN MENU ===");
        System.out.println("1. Ayam Bakar");
        System.out.println("2. Ayam Basah");
        System.out.print("Masukkan pilihan (1-2): ");
        int pilihan = input.nextInt();
        
        if (pilihan == 1) {
            System.out.println("=== PILIHAN ===\nAyam Bakar");
        } else if (pilihan == 2) {
            System.out.println("=== PILIHAN ===\nAyam Basah");
        } else {
            System.out.println("Pilihan salah!");
        }
    }
}
