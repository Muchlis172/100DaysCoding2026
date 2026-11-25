import java.util.Scanner;

class Day85{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int nilai[] = new int[5];
    for(int i = 0;i < nilai.length;i++){
      System.out.print("Nilai ke-"+(i+1)+": ");
      nilai[i] = sc.nextInt();
    }
    int min = nilai[0];
    for(int i = 0;i < nilai.length;i++){
      if(min > nilai[i]){
        min=nilai[i];
      }
    }
    System.out.println("Nilai minimal/terendah kamu: "+min);
  }
}
