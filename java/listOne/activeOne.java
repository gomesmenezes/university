// Escreva um programa que imprima seu nome, idade e cidade onde nasceu

package listOne;
import java.util.Scanner;

public class activeOne {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in, "UTF-8");

    System.out.println("Digite seu nome: ");
    String name = scanner.nextLine();

    System.out.println("Digite a sua idade: ");
    Integer age = Integer.parseInt(scanner.nextLine());
    
    System.out.println("Digite onde você nasceu: ");
    String city = scanner.nextLine();

    System.out.println("Oi " + name + " você tem " + age + " e nasceu no " + city);

    scanner.close();
  }
}
