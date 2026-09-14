import java.util.Scanner;
class Day13{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("===SOAL1===");
    System.out.println("nama\tjurusan");
    System.out.println("sela\tinformatika");
    System.out.println("meli\tinformatika");

    System.out.println("===SOAL2===");
    int stok = 20;
    int hB = 25500;
    double bB = 3.5;
    System.out.println("Jumlah barang = "+stok);
    System.out.println("Harga barang = "+hB);
    System.out.println("Berat barang = "+bB);

    System.out.println("===SOAL3===");
    System.out.printf("===INFORMASI MAHASISWA===\n");
    System.out.printf("%-14s:%s\n", "Nama", "Dwi");
    System.out.printf("%-14s:%s\n", "NIM", "D0225330");
    System.out.printf("%-14s:%d\n", "umur", 19);
    System.out.printf("%-14s:%.2f\n", "ipk", 3.89);
    System.out.printf("%-14s:%c\n", "Jenis kelamin", 'P');

    System.out.println("===SOAL4===");
    int rinaSaldoNow = 25000;
    System.out.println("Saldo awal = "+rinaSaldowNow);
    int saldoMasuk = 20000;
    System.out.println("Saldo masuk = "+saldoMasuk);
    rinaSaldoNow = 45000;
    System.out.println("Saldo akhir = "+rinaSaldowNow);

    System.out.println("===SOAL5===");
    System.out.print(" Masukkan nama pemesan : ");
    String np = sc.nextLine();
    System.out.print(" Masukkan nama makanan : ");
    String nm = sc.nextLine();
    System.out.print(" Masukkan jumlah : ");
    int jm = sc.nextInt();
    System.out.print(" Masukkan kode pesanan : ");
    char kp = sc.next().charAt(0);

    System.out.println("===DATA PESANAN===");
    System.out.println("Nama pemesan   : "+np);
    System.out.println("Nama makanan   : "+nm);
    System.out.println("Jumlah pesanan : "+jm);
    System.out.println("Kode pesanan   : "+kp);
  }
}
