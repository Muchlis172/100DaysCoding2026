import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = scanner.nextInt();

        if (angka > 0) {
            System.out.println("Angka " + angka + " adalah bilangan POSITIF.");
        } else if (angka < 0) {
            System.out.println("Angka " + angka + " adalah bilangan NEGATIF.");
        } else {
            System.out.println("Angka " + angka + " adalah bilangan NOL.");
        }
    }
}
