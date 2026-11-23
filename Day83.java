import java.util.Scanner;

class Day83{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int []tabungan = new int[12];
    int total = 0;
    for(int i = 0; i < tabungan.length; i++){
      System.out.print("Tabungan bulan "+(i+1)+": ");
      tabungan[i] = sc.nextInt();
    }
    for(int i = 0; i < tabungan.length; i++){
      total = total+tabungan[i];
    }
    System.out.println("Total tabungan selama 12 bulan: "+total);
  }
}
