package Construtor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do produto");
        System.out.printf("Nome: ");
        String name = sc.nextLine();

        System.out.printf("Preço: ");
        Double price = sc.nextDouble();

        System.out.printf("Quantidade em estoque: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Dados do produto" + product);
        System.out.println();

        System.out.printf("Entre a quantidade de produtos para adicionar: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.printf("Entre a quantidade de produtos para remover: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Dados atualizados: " + product);

        sc.close();

    }
}
