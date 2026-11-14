import java.util.Scanner;

class Day74{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    String judul = sc.next();
    System.out.println(judul.toUpperCase());
    System.out.println(judul.toLowerCase());
    System.out.println("Jumlah karakter = "+judul.toUpperCase());
    if(judul.length() > 20){
      System.out.println("Judul buku cukup panjang");
    }else{
      System.out.println("Judul buku tidak terlalu panjang");
    }
  }
}
