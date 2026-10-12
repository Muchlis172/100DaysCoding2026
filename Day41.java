import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu ruangan (C) : ");
        int suhu = input.nextInt();

        if (suhu > 30) {
            System.out.println("Kondisi: Panas");
        } else if (suhu >= 15) {
            System.out.println("Kondisi: Normal");
        } else {
            System.out.println("Kondisi: Dingin");
        }
    }
}
