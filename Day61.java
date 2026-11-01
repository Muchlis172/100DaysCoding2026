import java.util.Scanner;

class Day61{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Mencetak hasil dari perkalian 1 - N");
    int N = sc.nextInt();

    int total = 1;
    for (int i = 1;i <= N; i++){
      total *= i;
    }
    System.out.println("Hasil perkalian dari 1 - "+N+" = "+total);
  }
}
