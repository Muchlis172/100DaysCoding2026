import java.util.Scanner;
class Day24{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Menghitung luas persegi panjang\n");
    System.out.print("Masukkan nilai panjang : ");
    double panjang = sc.nextDouble();
    System.out.print("Masukkan nilai lebar : ");
    double lebar = sc.nextDouble();

    double luasPersegiPanjang = panjang*lebar;
    
    System.out.print("Hasil Luas Persegi Panjang : "+luasPersegiPanjang);
  }
}
