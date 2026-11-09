import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = sc.nextInt();

        System.out.println("Bilangan ganjil dari "+n+" sampai 1");
        for (int i = n;i>=1; i--){
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Bilangan genap dari  "+n+" sampai 1");
        for (int i = n;i>=1; i--){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
