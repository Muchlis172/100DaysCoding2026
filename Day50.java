import java.util.Scanner;

class Day50{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Cek angkamu genap/ganjil");
    System.out.print("Masukkan angkamu : ");
    long angka = sc.nextLong();

    String gg = (angka%2==0) ? "Genap" : "Ganjil";

    System.out.println("Angkamu adalah : "+gg);
    
  }
}
