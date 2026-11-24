import java.util.Scanner;

class Day84{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int nilai[] = new int[5];
    for(int i = 0;i < nilai.length;i++){
      System.out.print("Nilai ke-"+(i+1)+": ");
      nilai[i] = sc.nextInt();
    }
    int max = nilai[0];
    for(int i = 0;i < nilai.length;i++){
      if(max < nilai[i]){
        max=nilai[i];
      }
    }
    System.out.println("Nilai maksimal/tertinggi kamu: "+max);
  }
}
