/* Escreva um código que recebe um número. Caso o número seja positivo, imprima a raiz quadrada
(use Math.sqrt(valor)). Caso seja negativo, imprima o número ao cubo (use Math.pow(valor,
expoente)). */

package listTwo;
import java.util.Scanner;

public class root {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite um número: ");
    Double numberOne = scanner.nextDouble();
    
    if (numberOne >= 0) {
      double raizquadrada = Math.sqrt(numberOne);
      System.out.println("O valor é " + raizquadrada);
    } else {
      double cubo = Math.pow(numberOne, 3);
      System.out.println("O valor desse número ao cubo é: " + cubo);
    }
    scanner.close();
  }
}
