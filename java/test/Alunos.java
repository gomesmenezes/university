package test;

public class Alunos {

  public String name;
  public double note;
  public int age;

  public Alunos(String name, double note, int age) {
    this.name = name;
    this.note = note;
    this.age = age;
  }

  public void display () {
    System.out.println("Nome: " + name);
    System.out.println("Nota: " + note);
    System.out.println("Idade: " + age);
  }

  public static void main(String[] args) {
    Alunos aluno1 = new Alunos("Jose", 6.8, 18);
    Alunos aluno2 = new Alunos("Ze", 6.6, 17);
    
    System.out.println("Informações do Aluno 1:");
    aluno1.display();

    System.out.println("\nInformações do Aluno 2:");
    aluno2.display();
  }
}
