// Realize a leitura de um inteiro e imprima o dobro, triplo e metade do valor lido;
package listOne;
import java.util.Scanner;

public class triple {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    Integer number = (scanner.nextInt());
    
    Integer dobro = number * 2;
    Integer triple = number * 3;
    Integer half = triple / 2;
    
    
    System.out.println("O dobro do número " + number + " é " + dobro + " e o triplo é " + triple + " e a metade do triplo é " + half);

    scanner.close();
  }
}
