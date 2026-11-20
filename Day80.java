import java.util.Scanner;

class Day80{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int []nilai = new int[5];
    for(int i = 0; i < nilai.length; i++){
      System.out.println("Masukkan nilai: ");
      nilai[i] = sc.nextInt(); 
    }
    System.out.print("masukkan indeks array yg ingin kamu lihat(0-4): ");
    int indeks = sc.nextInt();
    System.out.println("Nilai ke-"+(indeks+1)+": "+nilai[indeks]);
  }
}
