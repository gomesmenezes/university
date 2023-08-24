// Realize a leitura de um número inteiro e imprima seu antecessor e seu sucessor;
package listOne;
import java.util.Scanner;

public class predecessorAndSuccessor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    Integer numberOne = Integer.parseInt(scanner.nextLine());

    Integer successor = numberOne + 1;
    Integer predecessor = numberOne - 1;
    
    System.out.println("O sucessor do número " + numberOne + " é " + successor + " e o antecessor é " + predecessor);

    scanner.close();
  }
}
