// Escreva um código que lê um número e diz se o número é par ou ímpar.
package listTwo;
import java.util.Scanner;

public class odd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite um número para saber se ele é par ou impar: ");
    int numberOne = scanner.nextInt();
    
    if (numberOne % 2 == 0) {
      System.out.println("O número " + numberOne + " é um número Impar");
    } else {
      System.out.println("O número " + numberOne + " é um número Par");
    }
    scanner.close();
  }  
}
