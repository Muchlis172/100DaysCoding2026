import java.util.Scanner;

class Day48{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("===KALKULATOR===");
    System.out.print("Masukkan angka : ");
    double a = sc.nextDouble();
    System.out.print("Masukkan operator(+,-,*,/) : ");
    char c = sc.next().charAt(0);
    System.out.print("Masukkan angka : ");
    double b = sc.nextDouble();
    
    switch (c){
      case '+' : 
        System.out.print(" Hasil : "+a+" "+c+" "+b+" = "+(a+b));
        break;
      case '-' : 
        System.out.print(" Hasil : "+a+" "+c+" "+b+" = "+(a-b));
        break;
      case '*' : 
        System.out.print(" Hasil : "+a+" "+c+" "+b+" = "+(a*b));
        break;
      case '/' : 
        System.out.print(" Hasil : "+a+" "+c+" "+b+" = "+(a/b));
        break;
      default : 
        System.out.print("Kesalahan operator");
        break;
    }
  }
}
