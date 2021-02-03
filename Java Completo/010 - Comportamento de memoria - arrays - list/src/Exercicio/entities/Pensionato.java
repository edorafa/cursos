package Exercicio.entities;

public class Pensionato {

    private int numero;
    private String name;
    private String email;
    private double valorAlguel;

    public Pensionato(int numero, String name, String email, double valorAlguel) {
        this.numero = numero;
        this.name = name;
        this.email = email;
        this.valorAlguel = valorAlguel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getValorAlguel() {
        return valorAlguel;
    }

    public void setValorAlguel(double valorAlguel) {
        this.valorAlguel = valorAlguel;
    }

    public String toString(){
        return "Numero do quarto: "
                + this.numero + "\n"
                + "Nome do cliente: "
                + name + "\n"
                + "Email: "
                + email + "\n"
                + "Valor aluguel: "
                + valorAlguel;
    }
}

