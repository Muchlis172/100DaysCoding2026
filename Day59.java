import java.util.Scanner;

class Day59{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Mencetak angka kelipatan M dari 1 - N");
    System.out.print("Masukkan angka N : ");
    int N = sc.nextInt();
    System.out.print("Masukkan angka M : ");
    int M = sc.nextInt();

    for(int i = 1; i <= N; i++){
      if(i%M==0){
        System.out.print(i+" ");
      }
    }
  }
}
