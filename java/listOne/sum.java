package listOne;

public class sum {
  public static void main(String[] args) {
          int limite = 8; 
          int soma = 0;

          for (int i = 1; i <= limite; i++) {
              soma += i;
          }
  
          System.out.println("A soma dos primeiros " + limite + " números inteiros é: " + soma);
      }
  }
  
