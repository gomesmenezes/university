/* Crie um programa que lê um número inteiro positivo e escreve os números de 1 até o
número digitado. */
package listThree;

import java.util.Scanner;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numberOne = sc.nextInt();

        if (numberOne >= 1) {
            for (int count = 1; count <= numberOne; count++) {
                System.out.println(count);
            }
        }
        sc.close();
    }
}
