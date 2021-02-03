package ExercicioLista.application;

import ExercicioLista.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdEmpregados;
        String nome;
        double salario;

        System.out.print("Quantos empregados serão registrados? ");
        qtdEmpregados = sc.nextInt();
        List<Funcionario> funcionario = new ArrayList<>();

        for (int i = 0; i < qtdEmpregados; i++) {
            System.out.println("Funcionário #" + (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            while (verificarId(funcionario, id)) {
                System.out.print("Id ja cadastrado. Tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Salário: ");
            salario = sc.nextDouble();

            Funcionario func = new Funcionario(id, nome, salario);
            funcionario.add(func);
            System.out.println();
        }

        System.out.print("Entre o id do usuário que receberá aumento: ");

        int id = sc.nextInt();
        Funcionario func = funcionario.stream().filter(x->x.getId() == id).findFirst().orElse(null);

        if(func == null) {
            System.out.println("Esse id nao existe!");
        }
        else {
            func.atualizaSalario();
            System.out.println("Novo salário: " + func.getSalario());
        }

        System.out.println();
        System.out.println("Lista de funcionários");

        for (Funcionario emp : funcionario){
            System.out.println(emp);
        }
    }

    public static boolean verificarId(List<Funcionario> func, int id){
        Funcionario emp = func.stream().filter(x->x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
