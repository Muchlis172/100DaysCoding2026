import java.util.Scanner;

class Day53{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Tabungan Dwi");

    int tbgDwi = 0;
    int nabungGa = 1;
    int ttlTabungan = 0;
    while(nabungGa!=0){
      System.out.print("Nabung berapa hari ini : ");
      tbgDwi = sc.nextInt();
      ttlTabungan+=tbgDwi;
      System.out.print("Masih pengen nabung ga? ketik 1 untuk lanjut, ketik 0 untuk udahan : ");
      nabungGa = sc.nextInt();
      if(nabungGa==0){
        System.out.println("Total tabungan Dwi : "+ttlTabungan);
      }
    }
  }
}
