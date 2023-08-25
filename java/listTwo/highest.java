/* Crie um programa que lê um número. Se o número for maior do que 100, então imprima metade do
número. */
package listTwo;
import java.util.Scanner;

public class highest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double numberOne = scanner.nextDouble();

    if (numberOne >= 100) {
      double halfNumber = numberOne / 2;
      System.out.println("A metade do número: " + halfNumber);
    } else { 
      System.out.println("Você não digitou um número maior que 100");
    }

    scanner.close();
  }
}
