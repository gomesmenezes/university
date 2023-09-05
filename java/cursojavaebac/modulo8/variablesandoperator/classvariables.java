package cursojavaebac.modulo8.variablesandoperator;

public class classvariables {
  
  private int code = 1;

  private long codeBig = 777898723; 
  
  private double valorDecimal1 = 1.2;

  private boolean status = false;

  private String texto;


  // Menos usadas
  private float valorDecimal;

  private short shor;

  private byte bi;

    // Método que retorna um texto 
    public String returnTexto() { 
      this.code = 0; // O This acessa a variavel codigo nesse escopo de classe, pode acessar em outro escopo se for publi
      return "asdasd";
    }
    
    // Método que retorna um inteiro 
    public int returnIntValue() {
      int val = 10; // variavel de escopo de metodo, so esse método tem acesso a essa variavel
      return val;
    }
    
    // Método que retorna um Long 
    public long returnLongValue(long num) {
      return num;
    }
}
