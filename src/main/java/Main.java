import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nulo = 0;

    System.out.println("Digite o valor de x");
    int x = sc.nextInt( );
    System.out.println("Digite o valor de y");
    int y = sc.nextInt( );

    while ( x != nulo && y != nulo ) {
      if ( x > nulo && y > nulo) {
        System.out.println("Pertencente ao 1° quadrante");
      }   

      if ( x > nulo && y < nulo ) {
        System.out.println("Pertencente ao 4° quadrante");
      }

      if ( x < nulo && y > nulo ) {
        System.out.println("Pertencente ao 2° quadrante");
      }

      if ( x < nulo && y < nulo ) {
        System.out.println("Pertencente ao 3° quadrante");
      }
      System.out.println("Digite o valor de x");
      x = sc.nextInt( );
      System.out.println("Digite o valor de y");
      y = sc.nextInt( );
    }
    sc.close( );
  }
}