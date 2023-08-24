// Crie um programa que simula uma calculadora, utilizando sempre os mesmos números para todas as operações

package listOne;
import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    Integer numberOne = Integer.parseInt(scanner.nextLine());

    System.out.println("Digite o primeiro número: ");
    Integer numberTwo = Integer.parseInt(scanner.nextLine());

    Integer sum = numberOne + numberTwo;
    Integer sub = numberOne - numberTwo;
    Integer multiplier = numberOne * numberTwo;
    Integer division = numberOne / numberTwo;
    Integer rest = numberOne % numberTwo;
    Integer exponent = numberOne ^ numberTwo;

    System.out.println("Soma do número " + numberOne + " + " + numberTwo + " é igual a " + sum);
    System.out.println("Subtração do número " + numberOne + " - " + numberTwo + " é igual a " + sub);
    System.out.println("Multiplicação do número " + numberOne + " * " + numberTwo + " é igual a " + multiplier);
    System.out.println("Divisão do número " + numberOne + " / " + numberTwo + " é igual a " + division);
    System.out.println("Resto do número " + numberOne + " % " + numberTwo + " é igual a " + rest);
    System.out.println("Expoente do número " + numberOne + " ^ " + numberTwo + " é igual a " + exponent);

    scanner.close();
  }
}