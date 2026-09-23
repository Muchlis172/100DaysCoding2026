public class Day22 {
    public static void main(String[] args) {
        String a = "Halo";
        String b = " Dek;

        String temp = a;
        a = b;
        b = temp;

        System.out.println("\nSetelah ditukar:");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
    }
}
