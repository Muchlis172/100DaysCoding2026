import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        
        int total = 0;
        
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        
        System.out.println("Hasil penjumlahan dari 1 sampai " + N + " adalah: " + total);
      
    }
}
