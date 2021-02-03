package Curso;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Entre os dados do produto");
        System.out.printf("Nome: ");
        product.name = sc.nextLine();

        System.out.printf("Preço: ");
        product.price = sc.nextDouble();

        System.out.printf("Quantidade em estoque: ");
        product.quantity = sc.nextInt();

        System.out.println("Dados do produto" + product);
        System.out.println();

        System.out.printf("Entre a quantidade de produtos para adicionar: ");
        int quantity = sc.nextInt();
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
