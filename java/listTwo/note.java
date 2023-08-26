/* Faça um programa que recebe duas notas de um aluno. O programa deve calcular a média e dar o
seguinte resultado:
◆ Se a média for maior ou igual a 7,0, imprima “Aprovado”.
◆ Se a média for menor que 4,0, imprima “Reprovado”.
◆ Se a média for 10,0, imprima “Aprovadíssimo”.
◆ Se a média for menor que 7,0 mas maior ou igual a 4,0, imprima “Final”, e em seguida leia
mais uma nota.
● Se a nota da final for maior ou igual a 5,0, imprima “Aprovado na final”.
● Se a nota da final for menor que 5,0, imprima “Reprovado na final”. */
package listTwo;
import java.util.Scanner;

public class note {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o primeiro número: ");
    Double noteOne = scanner.nextDouble();
    
    System.out.print("Digite o segundo número: ");
    Double NoteTwo = scanner.nextDouble();
    
    Double avarege = (noteOne + NoteTwo) / 2;

    if (avarege >= 7 && avarege < 10) {
      System.out.println("Aprovado com nota: " + avarege);
    } else if (avarege < 4) {
      System.out.println("Reprovado com nota: " + avarege);
    } else if (avarege >= 10) {
      System.out.println("Aprovadíssimo com nota: " + avarege);
    } else if (avarege < 7 && avarege >= 4) {
      System.out.println("Final");
      
      System.out.println("Digite sua terceira nota: ");
      Double noteThree = scanner.nextDouble();

      if (noteThree >= 5) {
        System.out.println("Aprovado na final com nota: " + noteThree);
      } else if (noteThree < 5) {
        System.out.println("Reprovado na final com nota: " + noteThree);
      }
    } else {
      System.out.println("Número invalido");
    }
    scanner.close();
  }
}
