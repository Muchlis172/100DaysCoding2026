import java.util.Scanner;
public class Day043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angkaKamu = sc.nextInt();

        if (angkaKamu % 3 == 0 && angkaKamu % 5 == 0) {
            System.out.println("Kelipatan 3 dan 5");
        } else if (angkaKamu % 3 == 0) {
            System.out.println("Kelipatan 3");
        } else if (angkaKamu % 5 == 0) {
            System.out.println("Kelipatan 5");
        } else {
            System.out.println("Bukan kelipatan 3 maupun 5");
        }
    }
}
