package test;
import java.util.Scanner;

public class modelos {
  public int somar(int a, int b) {
    return a + b;
  }  

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    modelos test = new modelos();

    System.out.println("Digite o primeiro número: ");
    int numberOne = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    int numberTwo = scanner.nextInt();

    int result = test.somar(numberOne, numberTwo);

    System.out.println(result);
  }
}