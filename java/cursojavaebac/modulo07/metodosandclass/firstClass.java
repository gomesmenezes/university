/*
 * @author gomes.svg
 */

package cursojavaebac.modulo07.metodosandclass;

// Cria uma classe
public class firstClass { 
  // Método principal
  public static void main(String args[]) {
    
    System.out.println("Olá José"); 
    
    Cliente cliente = new Cliente(); // Instanciar uma classe significa alocar essa variavel no espaço de memoria em java (Dando vida)
    
    cliente.cadastrarAdress("Rua 1");
    
    cliente.setCode(5);

    System.out.println(cliente.getCode());
    
    cliente.imprimirAdress();

    System.out.println(cliente.returnNameCliente()); 

    System.out.println(cliente.getFullValue()); 

    }
  }
