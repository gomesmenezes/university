package listTwo;
import java.util.Scanner;

public class dayswitch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número de 1 a 7 e veja o dia da semana.");
    int day = scanner.nextInt();

    if (day >= 1 || day <= 7) {
      switch (day) {
      case 1:
        System.out.println("Segunda-feira, dia 01");
        break;
      case 2:
        System.out.println("Terça-feira, dia 02");
        break;
      case 3:
        System.out.println("Quarta-feira, dia 03");
        break;
      case 4:
        System.out.println("Quinta-feira, dia 04");
        break;
      case 5:
        System.out.println("Sexta-feira, dia 05");
        break;
      case 6:
        System.out.println("Sabado, dia 06 ");
        break;
      case 7:
        System.out.println("Domingo, dia 07");
        break;
      default:
        System.out.println("Número invalido");
      }
    } else {
      System.out.println("Número fora do intervalo de 1 a 7");
    }
    
    scanner.close();
  }
}
