/*6. Crie um programa que lê dois números. Em seguida, faça a soma dos dois números. Se o resultado
for maior ou igual a 100, o programa deve imprimir o resultado. Independente do resultado, o
programa também deve anunciar que chegou ao fim do código. */
package listTwo;
import java.util.Scanner;

public class hundred {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o primeiro número: ");
    double numberOne = scanner.nextDouble();
    
    System.out.print("Digite o segundo número: ");
    double numberTwo = scanner.nextDouble();
    
    double sum = numberOne + numberTwo;

    if (sum >= 100) {
      System.out.println("A soma dos dois números foi: " + sum);
      System.out.println("Fim do programa");
    } else {
      System.out.println("A soma dos dois números foi menor que cem");
      System.out.println("Fim do programa");
    }
    scanner.close();
  }
}
