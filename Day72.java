import java.util.Scanner;

class Day72{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int angka = sc.nextInt();
      int total=0;
      if(angka%2==0){
        System.out.println(total+angka);
      }else{
        break;
      }
    }
  }
}
