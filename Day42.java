import java.util.Scanner;
class Day42{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah gaji kamu : ");
    int gaji = sc.nextInt();

    double gajiBersih = 0, pajakPenghasilan = 0.05, pajakBernafas = 0.10;
    if(gaji >= 5000000){
      System.out.println("Kamu Kaya katanya sihh");
      System.out.println("Gaji kotor : "+gaji);
      pajakPenghasilan = pajakPenghasilan*gaji;
      pajakBernafas = pajakBernafas*gaji;
      gajiBersih = gaji - (pajakPenghasilan+pajakBernafas);
      System.out.println("Pajak penghasilan : "+pajakPenghasilan);
      System.out.println("Pajak bernafas : "+pajakBernafas);
      System.out.println("Gaji bersih : "+gajiBersih);
    }else{
      System.out.println("Kamu kurang kaya katanya sihh");
      System.out.println("Gaji kotor : "+gaji);
      pajakPenghasilan = pajakPenghasilan*gaji;
      pajakBernafas = pajakBernafas*gaji;
      gajiBersih = gaji - (pajakPenghasilan+pajakBernafas);
      System.out.println("Pajak penghasilan : "+pajakPenghasilan);
      System.out.println("Pajak bernafas : "+pajakBernafas);
      System.out.println("Gaji bersih : "+gajiBersih);
    }
  }
}
