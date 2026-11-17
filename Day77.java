public class Day77 {
    public static void main(String[] args) {
        String nama = "  Ahmad Muchlis  ";
        System.out.println("Panjang teks\t : " + nama.length());
        nama = nama.trim(); 
        System.out.println("Trim\t\t : " + nama); 
        System.out.println("Uppercase\t : " + nama.toUpperCase());
        System.out.println("Lowercase\t : " + nama.toLowerCase());
        System.out.println("Karakter pertama : " + nama.charAt(0)); 
        System.out.println("Replace\t\t : " + nama.replace("Ahmad", "")); 
        System.out.println("Contains\t : " + nama.contains("Muchlis"));
        System.out.println("Equals\t\t : " + nama.equals("Ahmad Muchlis"));
        System.out.println("Substring\t : " + nama.substring(0, 8)); 
    }
}
