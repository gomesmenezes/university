/* Crie um programa que irá funcionar como uma calculadora. Primeiro, o programa deve receber
dois números, e em seguida um símbolo que representa uma operação matemática (+ para soma, -
para subtração, * para multiplicação e / para divisão). Por fim, imprima o resultado da conta. */
package listTwo;
import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o primeiro número: ");
    int numberOne = scanner.nextInt();
    
    System.out.print("Digite o segundo número: ");
    int numberTwo = scanner.nextInt();

    System.out.print("Qual operação você quer fazer? ");
    char symbol = scanner.next().charAt(0);
    
    double result = 0;

    switch (symbol) {
    case '+':
      result = numberOne + numberTwo;
      System.out.println("A soma dos dois número é " + result);
      break;
    case '-':
      result = numberOne - numberTwo;
      System.out.println("A subtração dos dois número é " + result);
      break;
    case '*':
      result = numberOne * numberTwo;
      System.out.println("A multiplicação dos dois número é " + result);
      break;
    case '/': 
      result = numberOne / numberTwo;
      System.out.println("A divisão dos dois números é" + result);
      break;
    default:
      System.out.println("Operação inválida.");
      break;
    }
    scanner.close();
  }
}
