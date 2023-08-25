// Crie duas variáveis do tipo inteiro e as compare usando if. Se o primeiro número for maior, imprima “primeiro”, caso contrário, imprima “segundo”.
package listTwo;
import java.util.Scanner;

public class ifjava {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int numberOne = scanner.nextInt();
    
    System.out.print("Digite o segundo número: ");
    int numberTwo = scanner.nextInt();

    if (numberOne > numberTwo) {
      System.out.println("O primeiro número que você digitou é maior que o segundo. ");
    } else if (numberOne < numberTwo) {
      System.out.println("O segundo número que você digitou é maior que o primeiro. ");
    }

    scanner.close();
  }
}
