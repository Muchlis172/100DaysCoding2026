import java.util.Scanner;

class Day63{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("M : ");
    int M = sc.nextInt();
    System.out.print("N : ");
    int N = sc.nextInt();

    int total = 1;
    for(int i = 1; i <= N; i++){
      total = total*M;
    }
    System.out.println("total : "+total);
  }
}
