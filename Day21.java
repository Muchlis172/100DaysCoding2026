public class Day21 {
    public static void main(String[] args) {
        
        String strByte = "120";
        String strShort = "32000";
        String strInt = "2000000";
        String strLong = "9876543210";
        String strFloat = "3.14f";
        String strDouble = "123.456";
        String strBoolean = "true";
        String strChar = "A";
      
        byte nilaiByte = Byte.parseByte(strByte);
        short nilaiShort = Short.parseShort(strShort);
        int nilaiInt = Integer.parseInt(strInt);
        long nilaiLong = Long.parseLong(strLong);
        float nilaiFloat = Float.parseFloat(strFloat);
        double nilaiDouble = Double.parseDouble(strDouble);
        boolean nilaiBoolean = Boolean.parseBoolean(strBoolean);
        char nilaiChar = strChar.charAt(0); 
      
        System.out.println("=== Hasil Konversi ===");
        System.out.println("byte    : " + nilaiByte);
        System.out.println("short   : " + nilaiShort);
        System.out.println("int     : " + nilaiInt);
        System.out.println("long    : " + nilaiLong);
        System.out.println("float   : " + nilaiFloat);
        System.out.println("double  : " + nilaiDouble);
        System.out.println("char    : " + nilaiChar);
        System.out.println("boolean : " + nilaiBoolean);
    }
}
