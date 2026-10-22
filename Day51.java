class Day51{
  public static void main(String[]args){

    System.out.println("Mencetak angka 1-5");
    for(int i = 1; i <= 5; i++){
      System.out.print(i+" ");
      System.out.println(i);
    }
    System.out.println("\nMencetak angka genap 1-10");
    for(int i = 1; i <= 10; i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
    System.out.println("\nMencetak angka ganjil 1-10");
    for(int i = 1; i <= 10; i++){
      if(i%2==1){
        System.out.println(i);
      }
    }
    System.out.println("\nMenjumlahkan angka  1-10");
    int sum = 0;
    for(int i = 1; i <= 10; i++){
      sum +=i;
    }
    System.out.println("Jumlah angka 1-10 = "+1);
    
  }
}
