import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai kamu : ");
        int nilai = sc.nextInt();
        if (nilai >= 80) {
            System.out.println("Nilai: A");
        } else if (nilai >= 70) {
            System.out.println("Nilai: B");
        } else if (nilai >= 60) {
            System.out.println("Nilai: C");
        } else if (nilai >= 50) {
            System.out.println("Nilai: D");
        } else {
            System.out.println("Nilai: E");
        }
    }
}
