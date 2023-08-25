package listOne;
import java.text.DecimalFormat;
import java.util.Scanner;

public class discounts {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Digite o preço do produto: ");
        double product = scanner.nextDouble();

        double discount10 = product * 0.1;
        double discount20 = product * 0.2;
        double discount50 = product * 0.5;

        double discount10plus = product - discount10;
        double discount20plus = product - discount20;
        double discount50plus = product - discount50;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("O Produto custa R$" + df.format(product) + " com desconto de 10%, o novo valor será R$" + df.format(discount10plus) + " desconto de 20%, o novo valor será R$" + df.format(discount20plus) + " desconto de 50%, o novo valor será R$" + df.format(discount50plus));
    } catch (java.util.InputMismatchException e) {
        System.out.println("Valor inválido. Certifique-se de inserir um número válido.");
    }

    scanner.close();
  }
}
