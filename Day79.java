import java.util.Scanner;

class Day78{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int []nilai = new int[5];
    double ratarata,total = 0;
    for(int i = 0; i < nilai.length; i++){
      System.out.println("Masukkan nilai: ");
      nilai[i] = sc.nextInt(); 
    }
    for(int nilaiEch : nilai) {
      System.out.println("nilai: " + nilaiEch);
      total += nilaiEch;
    }
    ratarata = total/nilai.length;
    System.out.println("Total nilai     : "+total);
    System.out.println("Rata-rata nilai : "+ratarata);
  }
}
