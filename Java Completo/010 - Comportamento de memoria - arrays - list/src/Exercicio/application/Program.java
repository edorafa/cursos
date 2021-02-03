package Exercicio.application;

import Exercicio.entities.Pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pensionato[] pensionato = new Pensionato[10];

        int quartosAlugados, quartoEscolhido;
        double aluguel;
        String nome, email;
        quartosAlugados = sc.nextInt();

        for (int i = 0; i < quartosAlugados; i++) {
            System.out.print("Quarto Escolhido: ");
            quartoEscolhido = sc.nextInt();

            sc.nextLine();
            System.out.print("Nome cliente: ");
            nome = sc.nextLine();

            System.out.print("Email: ");
            email = nome = sc.nextLine();

            System.out.print("Valor do Alugel: ");
            aluguel = sc.nextDouble();

            pensionato[quartoEscolhido - 1] = new Pensionato(quartoEscolhido,nome,email,aluguel);
        }

        System.out.println(pensionato.length);

        System.out.println();
        System.out.println("Quartos alugados");
        System.out.println();

        for (int i = 0; i < pensionato.length; i++) {
            if(pensionato[i] != null){

                System.out.println(pensionato[i]);
                System.out.println("-------------------------------------");
            }
        }
    }
}
