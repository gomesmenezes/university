// Crie um programa que recebe um valor de peso em quilos e o converte para libras.
package listOne;
import java.util.Scanner;
import java.text.DecimalFormat;

public class weight {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o peso: ");
    Double weight = scanner.nextDouble();

    Double libra = weight * 2.205;

    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println("O valor em em Libras vai ser " + df.format(libra) + "lb");

    scanner.close();
  }
}
