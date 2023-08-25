/* Leia uma variável do tipo int. Utilizando a estrutura if, else if, else, imprima o dia da semana
correspondente ao número digitado. Caso o número seja menor que 1 ou maior que 7, imprima que
não foi possível identificar o dia. */ 
package listTwo;
import java.util.Scanner;

public class weekday {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número de 1 a 7 e veja o dia da semana.");
    int day = scanner.nextInt();

    if (day == 1 || day == 01) {
      System.out.println("Segunda-feira, dia 01");
    } else if (day == 2 || day == 02) {
      System.out.println("Terça-feira, dia 02");
    } else if (day == 3 || day == 03) {
      System.out.println("Quarta-feira, dia 03");
    } else if (day == 4 || day == 04) {
      System.out.println("Quinta-feira, dia 04");
    } else if (day == 5 || day == 05) {
      System.out.println("Sexta-feira, dia 05");
    } else if (day == 6 || day == 06) {
      System.out.println("Sabado, dia 06 ");
    } else if (day == 7 || day == 07) {
      System.out.println("Domingo, dia 07");
    } else {
      System.out.println("Valor invalido, digite um número de 1 a 7.");
    }

    scanner.close();
  }
}
