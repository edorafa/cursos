package ExercicioLista.entities;

public class Funcionario {

    private Integer Id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        Id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void atualizaSalario(){
        this.salario = this.salario + this.salario*0.1;
    }

    public String toString(){
        return this.Id + ", " + this.nome + ", " + String.format("%.2f", this.salario);
    }
}
