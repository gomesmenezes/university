// Crie um programa que simula uma calculadora, utilizando sempre os mesmos números para todas as operações

package listOne;
import java.util.Scanner;
import java.text.DecimalFormat;

public class calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    Integer numberOne = Integer.parseInt(scanner.nextLine());

    System.out.println("Digite o segundo número: ");
    Integer numberTwo = Integer.parseInt(scanner.nextLine());

    double numOneDouble = (double) numberOne;
    double numTwoDouble = (double) numberTwo;

    Double sum = numOneDouble + numTwoDouble;
    Double sub = numOneDouble - numTwoDouble;
    Double multiplier = numOneDouble * numTwoDouble;
    Double division = numOneDouble / numTwoDouble;
    Double rest = numOneDouble % numTwoDouble;
    Double exponent = Math.pow(numOneDouble, numTwoDouble);

    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    System.out.println("Soma do número " + numOneDouble + " + " + numTwoDouble + " é igual a " + decimalFormat.format(sum));
    System.out.println("Subtração do número " + numOneDouble + " - " + numTwoDouble + " é igual a " + decimalFormat.format(sub));
    System.out.println("Multiplicação do número " + numOneDouble + " * " + numTwoDouble + " é igual a " + decimalFormat.format(multiplier));
    System.out.println("Divisão do número " + numOneDouble + " / " + numTwoDouble + " é igual a " + decimalFormat.format(division));
    System.out.println("Resto do número " + numOneDouble + " % " + numTwoDouble + " é igual a " + decimalFormat.format(rest));
    System.out.println("Expoente do número " + numOneDouble + " ^ " + numTwoDouble + " é igual a " + decimalFormat.format(exponent));

    scanner.close();
  }
}
