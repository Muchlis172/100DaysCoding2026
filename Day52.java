import java.util.Scanner;

class Day52{ 
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int i = 0;
    while(i!=5421){
      System.out.print("Masukkam pw : ");
      i = sc.nextInt();
      if(i==5421){
        System.out.print("PIN benar, berhasil masuk");
      }
    }
    
  }
}
