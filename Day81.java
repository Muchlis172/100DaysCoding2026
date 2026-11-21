import java.util.Scanner;

class Day81{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan banyak jenis buah: ");
    int indeks = sc.nextInt();
    sc.nextLine();
    String[] buah = new String[indeks];
    for(int i = 0;i < buah.length;i++){
      System.out.print("Buah ke-"+(i+1)+": ");
      buah[i] = sc.nextLine();
    }
    System.out.println("\nIsi buah kamu");
    for(int i = 0;i < buah.length;i++){
      System.out.println("Buah ke-"+(i+1)+": "+buah[i]);
    }
  }
}
