import java.util.Scanner;
import java.util.Arrays;

class Day87{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama[] = new String[5];
        for (int i = 0;i < nama.length;i++){
            System.out.print("Nama ke-"+(i+1)+": ");
            nama[i] = sc.nextLine();
        }
        nama[3] = "Xora";
        System.out.println(("Daftar nama: ")+Arrays.toString(nama));
    }
}
