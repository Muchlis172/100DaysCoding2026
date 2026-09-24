import java.util.Scanner;
class Day23{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Menghitung luas sisi persegi\n");
    System.out.print("Masukkan nilai sisi : ");
    double sisi = sc.nextDouble();

    double luasPersegi = sisi*sisi;
    
    System.out.print("Hasil Luas Persegi : "+luasPersegi);
  }
}
