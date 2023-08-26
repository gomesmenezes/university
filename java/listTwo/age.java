/* Crie um programa que pergunta a idade do usuário. Se a resposta for menor do que 18, imprima
“você é menor de idade”, se tiver entre 18 e 65, imprima “você é adulto”, se for acima de 65 anos,
imprima “você é idoso”. */

package listTwo;
import java.util.Scanner;

public class age {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o primeiro número: ");
    int age = scanner.nextInt();
    
    if (age < 18) {
      System.out.println("Você tem " + age + " idade, você é de menor");
    } else if (age >= 18 && age < 65) {
      System.out.println(" Você tem " + age + " idade, você é adulto");
    } else {
      System.out.println("Você é idoso");
    }
    scanner.close();
  }
}
