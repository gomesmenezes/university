package listOne;
import java.util.Scanner;

public class variables {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um texto: ");
    String text = scanner.next();

    System.out.println("Digite um número entre 0 e 10");
    Integer number = Integer.parseInt(scanner.next());

    if (number < 1 || number > 10) {
      System.out.println("Por favor, digite um número entre 1 e 10.");
      scanner.close();
      return; // Encerra o programa
  }

    System.out.println("Digite seu peso: ");
    float weight = Float.parseFloat(scanner.next());

  Boolean peso1Boolean = true;

  System.out.println("Você digitou um Texto sendo: " + text + "\n" + "Você digitou um número de 0 a 10 sendo: " + number + "\n" + "Você digitou seu peso sendo kg: " + weight + " " + peso1Boolean);
  }
}
