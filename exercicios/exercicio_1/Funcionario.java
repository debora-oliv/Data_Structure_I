package exercicio_1;

import java.util.ArrayList;

public class Funcionario {

    private static int nextId = 0;

    private final int id;

    private Double salario;

    private String nome;

    private static final ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario(Double salario, String nome) {
        id = ++nextId;

        this.nome = nome;

        if (salario >= 1500 && salario < 12000)
            this.salario = salario;
        else throw new IllegalArgumentException("Salário inválido");

        funcionarios.add(this);
    }

    public static void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public static void efetuarAumento(Integer id, Double porcentagem) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                funcionario.salario += funcionario.getSalario() * (porcentagem / 100);
                System.out.println("Aumento efetuado com sucesso!");
                return;
            }
        }
        throw new IllegalArgumentException("Esse ID não existe");
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
