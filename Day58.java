import java.util.Scanner;

class Day58{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai N: ");
    int N = sc.nextInt();

    System.out.println("Mencetak angka ganjil N - 1 : ");
    for(int i = N; i >= 1; i--){
      if(i%2==1){
        System.out.print(i+" ");
      }
    }
    System.out.println("Mencetak angka Genap N - 1 : ");
    for(int i = N; i >= 1; i--){
      if(i%2==0){
        System.out.print(i+" ");
      }
    }
  }
}
