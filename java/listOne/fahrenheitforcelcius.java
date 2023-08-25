// Crie um programa que recebe um valor de temperatura em Celsius e o converte para Kelvin e Fahrenheit.
package listOne;
import java.util.Scanner;

public class fahrenheitforcelcius {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a temperatura em Celsius: ");
    Double celsius = scanner.nextDouble();

    Double fahrenheit = (celsius * 9/5) + 32;
    double kelvin = celsius + 273.15;

    System.out.printf("O valor em Fahrenheit: " + fahrenheit + " e o valor em kelvin: " + kelvin);

    scanner.close();
  }
}
