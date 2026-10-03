public class Day32 {
    public static void main(String[] args) {
        // Inisialisasi Variabel
        int nilaiTugas = 80;
        int nilaiUjian = 75;
        int batasKelulusan = 70;
        
        // Operator Aritmatika
        int totalNilai = nilaiTugas + nilaiUjian;
        int rataRata = totalNilai / 2;
        
        // Operator Perbandingan & Logika 
        boolean lulusSemuaUjian = (nilaiTugas >= batasKelulusan) && (nilaiUjian >= batasKelulusan);
        
        // Mengecek apakah nilai rata-rata memenuhi syarat
        boolean lulusRataRata = rataRata >= 75;

        // Menampilkan Hasil
        System.out.println("--- Hasil Penilaian Siswa ---");
        System.out.println("Total Nilai      : " + totalNilai);
        System.out.println("Rata-rata Nilai  : " + rataRata);
        System.out.println("Lulus Semua Ujian: " + lulusSemuaUjian);
        System.out.println("Lulus Rata-rata  : " + lulusRataRata);
    }
}
