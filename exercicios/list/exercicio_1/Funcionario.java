package list.exercicio_1;

public class Funcionario {

    private static int nextId = 0;

    private final int id;

    private Double salario;

    private String nome;

    public Funcionario(Double salario, String nome) {
        id = ++nextId;

        this.nome = nome;

        if (salario >= 1500 && salario < 12000)
            this.salario = salario;
        else throw new IllegalArgumentException("Salário deve estar entre 1500 e 12000");
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + salario;
    }

    public int getId() {
        return id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalary(Double salario) {
        if(salario > 1500 && salario <= 12000)
            this.salario = salario;
        else
            throw new IllegalArgumentException("Salário deve estar entre 1500 e 12000");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
