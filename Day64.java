import java.util.Scanner;

class Day64{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Faktorial");

    System.out.print("Masukkan angka yg ingin kamu cari faktorialnya: ");
    int angka = sc.nextInt();

    int total = 1;
    for(int i = 1; i <= angka; i++){
      total*=i;
    }
    System.out.println("Hasil "+angka+"! = "+total);
  }
}
