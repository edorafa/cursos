package Exemplo.application;

import Exemplo.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Entre o numero da conta: ");
        int number = sc.nextInt();

        System.out.print("Entre o dono da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Tem deposito inicial?");
        char resposta = sc.next().charAt(0);

        if(resposta == 'y') {
            System.out.print("Digite o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            account = new Account(number, holder, depositoInicial);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.print("Dados da Conta: ");
        System.out.println(account);
    }
}
