// Crie um programa que leia dois valores: o primeiro é o tamanho da base de um triângulo, e o segundo é a altura. Calcule e imprima a área do triângulo.
package listOne;
import java.util.Scanner;
import java.text.DecimalFormat;

public class area {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor da base do triângulo: ");
    Double base = scanner.nextDouble();
    
    System.out.println("Digite o valor da altura: ");
    Double height = scanner.nextDouble();

    Double area = (base * height) / 2;

    System.out.println("O valor da área do triângulo é: " + area);


    scanner.close();
  }
}
