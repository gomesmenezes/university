import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    int code;
    int stock;

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
        this.stock = 0;
    }
}

public class CommerceSystem {
    private static ArrayList<Product> products = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            choice = displayMenu();
            switch (choice) {
                case 1:
                    listProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    addStock();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    sellProduct();
                    break;
                case 6:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (choice != 6);
    }

    private static int displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1) Listar todos os produtos");
        System.out.println("2) Cadastrar um novo produto");
        System.out.println("3) Adicionar estoque de um produto");
        System.out.println("4) Remover um produto do comércio");
        System.out.println("5) Vender algum produto existente");
        System.out.println("6) Sair do programa");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    private static void listProducts() {
        if (products.isEmpty()) {
            System.out.println("Nenhum produto cadastrado no sistema.");
        } else {
            for (Product product : products) {
                System.out.println(product.name + " (cód.: " + product.code + " | estoque: " + product.stock + ")");
            }
        }
    }

    private static void addProduct() {
        scanner.nextLine(); // Consume the newline character
        System.out.print("Nome do produto: ");
        String name = scanner.nextLine();
        System.out.print("Código do produto: ");
        int code = scanner.nextInt();
        Product newProduct = new Product(name, code);
        products.add(newProduct);
        System.out.println(name + " cadastrado com sucesso. Código: " + code + ", Estoque: 0");
    }

    private static void addStock() {
        System.out.print("Digite o código do produto para adicionar estoque: ");
        int code = scanner.nextInt();
        Product product = getProductByCode(code);
        if (product != null) {
            System.out.print("Quantidade a ser adicionada ao estoque: ");
            int quantity = scanner.nextInt();
            product.stock += quantity;
            System.out.println("Estoque atualizado para " + product.stock + " unidades.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void removeProduct() {
        System.out.print("Digite o código do produto para remover: ");
        int code = scanner.nextInt();
        Product product = getProductByCode(code);
        if (product != null) {
            products.remove(product);
            System.out.println(product.name + " removido do sistema.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void sellProduct() {
        System.out.print("Digite o código do produto para vender: ");
        int code = scanner.nextInt();
        Product product = getProductByCode(code);
        if (product != null) {
            System.out.print("Quantidade a ser vendida: ");
            int quantity = scanner.nextInt();
            if (quantity <= product.stock) {
                product.stock -= quantity;
                System.out.println(quantity + " unidades de " + product.name + " vendidas.");
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static Product getProductByCode(int code) {
        for (Product product : products) {
            if (product.code == code) {
                return product;
            }
        }
        return null;
    }
}
