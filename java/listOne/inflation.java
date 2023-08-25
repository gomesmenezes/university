// Realize a leitura de um float referente ao salário do cidadão e apresente o salário com reajuste de 10% da inflação.
package listOne;
import java.util.Scanner;
import java.text.DecimalFormat;

public class inflation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Salário: ");
    Double wage = scanner.nextDouble();

    Double inflation10 = wage * 0.10;
    Double aftertaxes = wage - inflation10;

    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println("Seu salário antes dos Impostos é R$" + df.format(wage) + " Depois da inflação de 10% seu sálario ficou R$" + df.format(aftertaxes));


    scanner.close();
  }
}