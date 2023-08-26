// Crie um programa que lê um número e diz se ele é maior do que 0, menor do que 0 ou é 0.
package listTwo;
import java.util.Scanner;

public class zero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double numberOne = scanner.nextDouble();

    if (numberOne > 0) {
      System.out.println("Seu número é maior que zero");
    } else if (numberOne < 0) {
      System.out.println("Seu número é menor que zero");
    } else if (numberOne == 0) {
      System.out.println("Seu número é Zero");
    } else {
      System.out.println("Número invalido");
    }
    scanner.close();
  }
}
