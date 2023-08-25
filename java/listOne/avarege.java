// Realize a leitura de três floats e imprima a média aritmética;

package listOne;
import java.util.Scanner;

public class avarege {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite sua primeira nota: ");
    Float noteOne = scanner.nextFloat();

    System.out.print("Digite sua primeira nota: ");
    Float noteTwo = scanner.nextFloat();

    System.out.print("Digite sua primeira nota: ");
    Float noteThree = scanner.nextFloat();

    Float avarege = (noteOne + noteTwo + noteThree) / 3;

    System.out.print("Você ficou com média: " + avarege);

    scanner.close();
  }
}
