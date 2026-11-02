import java.util.Scanner;

class Day62{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah mahasiswa(M): ");
    short M = sc.nextShort();
    System.out.print("Masukkan jumlah laporan per mahasiswa(N): ");
    short N = sc.nextShort();
    System.out.println("-- DAFTAR TUGAS MAHASISWA --");

    for(int i = 1; i <= M; i++){
      System.out.println("Mahasiswa ke-"+i);
      for(int u = 1; u <= N; u++){
        System.out.println("  - Laporan "+u);
      }
    }
  }
}
