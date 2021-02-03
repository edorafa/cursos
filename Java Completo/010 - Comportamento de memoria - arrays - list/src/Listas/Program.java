package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Armando");
        list.add("Marco");
        list.add("Marciano");
        list.add(2,"Amanda");


        System.out.println(list.size());

        System.out.println("-------------------------------");
        for(String valor : list){
            System.out.println(valor);
        }

        list.remove("Marco");
        list.remove(1);

        //remover quem comeca com M
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("-------------------------------");
        for(String valor : list){
            System.out.println(valor);
        }

        //posicao de um elemento
        System.out.println("Index de Bob: " + list.indexOf("Bob"));
        System.out.println("Index de Bob: " + list.indexOf("Rafael"));
        System.out.println("-------------------------------");

        //lista com nomes que comeca com A
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String valor : result){
            System.out.println(valor);
        }

        //encontrar primeiro elemento q comeca com A

        String name  = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
