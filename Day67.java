import java.util.Scanner;

class Day67{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int kolom = sc.nextInt();
    int baris = sc.nextInt();
    for(int i = 1; i <= kolom;i++){
      for(int j = 1; j <= baris;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
