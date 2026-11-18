import java.util.Scanner;

class Day78{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Buat akun");
    System.out.println("Username : ");
    String username = sc.nextLine();
    System.out.println("Password : ");
    String password = sc.nextLine();
    String username1,password1;
    do{
      System.out.println("login masss");
      System.out.println("Username : ");
      username1 = sc.nextLine();
      System.out.println("Password : ");
      password1 = sc.nextLine();
      if(!username1.equals(username) && !password1.equals(password)){
        System.out.println("Username dan Password salah");
      }else if(!username1.equals(username)){
        System.out.println("Username Salah");
      }else if(!password1.equals(password)){
        System.out.println("Password salah");
      }
    }while(!username1.equals(username) || !password1.equals(password));
  }
}
