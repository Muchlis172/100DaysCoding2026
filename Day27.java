public class Day27 {
    public static void main(String[] args) {
        // Inisialisasi variabel awal
        int angka = 5;
        
        System.out.println("Nilai awal: " + angka);
        
        // 1. Post-Increment (nilai ditambah 1 setelah digunakan)
        angka++; 
        System.out.println("Setelah angka++: " + angka); // Menjadi 6
        
        // 2. Pre-Increment (nilai ditambah 1 sebelum digunakan)
        ++angka; 
        System.out.println("Setelah ++angka: " + angka); // Menjadi 7
        
        // 3. Post-Decrement (nilai dikurangi 1 setelah digunakan)
        angka--; 
        System.out.println("Setelah angka--: " + angka); // Menjadi 6
        
        // 4. Pre-Decrement (nilai dikurangi 1 sebelum digunakan)
        --angka; 
        System.out.println("Setelah --angka: " + angka); // Menjadi 5
    }
}
