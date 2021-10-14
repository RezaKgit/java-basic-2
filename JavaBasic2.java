import java.util.Scanner;

public class JavaBasic2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("input nilai");
    int input = scan.nextInt();

    // if( Integer.parseInt(huruf) == 10 ) {
    if( input == 200 ) {
        System.out.println(true);
    } else {
        System.out.println(false);
    }
  }
}


