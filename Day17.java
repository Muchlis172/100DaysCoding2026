 class Day17 {
    public static void main(String[] args) {
        
        int angka = 10;
        System.out.println("Nilai awal angka = " + angka);

        // Penugasan dan penjumlahan (+=)
        angka += 5; // artinya angka = angka + 5
        System.out.println("Setelah += 5, nilai angka = " + angka);

        // Penugasan dan pengurangan (-=)
        angka -= 3; 
        System.out.println("Setelah -= 3, nilai angka = " + angka);

        // Penugasan dan perkalian (*=)
        angka *= 2; 
        System.out.println("Setelah *= 2, nilai angka = " + angka);

        // Penugasan dan pembagian (/=)
        angka /= 4; 
        System.out.println("Setelah /= 4, nilai angka = " + angka);

        // Penugasan dan sisa bagi
        angka %= 3; 
        System.out.println("Setelah %= 3, nilai angka = " + angka);
    }
}
