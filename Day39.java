import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;

        System.out.print("Masukkan angka pertama : ");
        angka1 = input.nextDouble();

        System.out.print("Pilih operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua    : ");
        angka2 = input.nextDouble();

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            hasil = angka1 / angka2; 
        } else {
            System.out.println("Operator salah!");
            return; 
        }

        System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
