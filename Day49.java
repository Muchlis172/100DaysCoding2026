import java.util.Scanner;

class Day49 {
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan umur kamu = ");
    short umur = sc.nextShort();
    
    String status = (umur >= 18) ? "Dewasa" : "Bocil";
    System.out.println("Umur   = "+umur);
    System.out.println("Status = "+status);
    
  }
}
