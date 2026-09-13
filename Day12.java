import java.util.Scanner;

class Day12{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Isi joo");
    System.out.print("Nama = ");
    String nama = sc.nextLine();
    System.out.print("Jurusan = ");
    String jrs = sc.nextLine();
    System.out.print("Angkatan = ");
    String ang = sc.nextLine();
    System.out.print("Harapan = ");
    String har = sc.nextLine();

    System.out.println("===Biodata===");
    System.out.println("Nama = "+nama);
    System.out.println("Jurusan = "+jrs);
    System.out.println("Angkatan = "+ang);
    System.out.println("Harapan = "+har);
  }
}
