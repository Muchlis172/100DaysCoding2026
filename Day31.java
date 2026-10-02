public class Day31 {
    public static void main(String[] args) {
        int nilai = 80;
        int absen = 90;

        System.out.println("Hasil AND: " + (nilai > 75 && absen > 80));
        System.out.println("Hasil OR : " + (nilai > 85 || absen > 80));
        System.out.println("Hasil NOT: " + !(nilai == 100));
    }
}
