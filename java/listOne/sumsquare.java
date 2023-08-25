// Crie um programa que calcula a soma dos quadrados de três números digitados pelo usuário.
package listOne;
import java.util.Scanner;

public class sumsquare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    double numberOne = scanner.nextDouble();
    
    System.out.println("Digite o segundo número: ");
    double numberTwo = scanner.nextDouble();
    
    System.out.println("Digite o terceiro número: ");
    double numberThree = scanner.nextDouble();

    double sumsquare = (numberOne * numberOne) + (numberTwo * numberTwo) + (numberThree * numberThree);
    System.out.println("A soma dos quadrados dos quadrados é: " + sumsquare);

    scanner.close();
  }
}