package listThree;

public class hundred {
    public static void main(String[] args) {
        int sum = 0; 

        for (int number = 1; number <= 100; number++) {
            sum += number; 
        }

        System.out.println("A soma dos números de 1 a 100 é: " + sum);
    }
}
