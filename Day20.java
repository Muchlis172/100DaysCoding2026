public class Day20 {
    public static void main(String[] args) {
        // Angka bulat (int)
        int angkaBulat = 100;
        String str1 = String.valueOf(angkaBulat);
        System.out.println("Integer ke String: " + str1); // Hasil: "100"

        // Angka desimal (double)
        double angkaDesimal = 99.9;
        String str2 = String.valueOf(angkaDesimal);
        System.out.println("Double ke String: " + str2); // Hasil: "99.9"

        // Boolean
        boolean status = true;
        String str3 = String.valueOf(status);
        System.out.println("Boolean ke String: " + str3); // Hasil: "true"
    }
}
