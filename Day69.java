import java.util.Scanner;

class Day69{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int panjang = sc.nextInt();
    int lebar = sc.nextInt();
    for(int i = 1; i <= lebar;i++){
      for(int j = 1; j <= panjang;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
