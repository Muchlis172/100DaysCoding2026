import java.util.Scanner;

class Day56{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai N: ");
    int N = sc.nextInt();

    System.out.println("Mencetak angka 1 - N : ");
    for(int i = 1; i <= N; i++){
      System.out.print(i+" ");
    }
    System.out.println("Mencetak angka N - 1 : ");
    for(int i = N ; i >= 1; i--){
      System.out.print(i+" ");
    }
    
  }
}
