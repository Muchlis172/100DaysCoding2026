import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String username = sc.nextLine();

        System.out.print("Masukkan Password: ");
        String password = sc.nextLine();

        System.out.print("Masukkan Program Studi: ");
        String prodi = sc.nextLine();

        System.out.println("\n--- Hasil Validasi ---");

        if (username.isEmpty()) {
            System.out.println("Username wajib diisi");
        }

        boolean isPasswordBenar = password.equals("Java123");
        if (isPasswordBenar) {
            System.out.println("Password benar");
        }

        if (prodi.equalsIgnoreCase("informatika")) {
            System.out.println("Program studi sesuai");
        }

        if (prodi.contains("Teknik")) {
            System.out.println("Berada di Fakultas Teknik");
        }

        if (!username.isEmpty() && !password.isEmpty() && isPasswordBenar) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }

    }
}
