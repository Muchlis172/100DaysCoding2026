public class Day30 {
    public static void main(String[] args) {
        int a = 15;
        int b = 15;
        int c = 20;

        boolean hasil1 = a >= b;
        boolean hasil2 = a <= c;
        boolean hasil3 = c > a;
        boolean hasil4 = a < c;

        System.out.println("Apakah a >= b? " + hasil1);
        System.out.println("Apakah a <= c? " + hasil2);
        System.out.println("Apakah c > a? " + hasil3);
        System.out.println("Apakah a < c? " + hasil4);
    }
}
