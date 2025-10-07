package exercicio_1;

import java.util.ArrayList;

public class Funcionario {

    private static int nextId = 0;

    private final int id;

    private Double salario;

    private String nome;

    private static ArrayList<Funcionario> funcionarios;

    public Funcionario(Double salario, String nome) {
        id = ++nextId;

        this.nome = nome;

        if (salario >= 1500 && salario < 12000)
            this.salario = salario;
        else throw new IllegalArgumentException("Salário inválido");

        this.funcionarios = new ArrayList<>();
    }

    public static void addFuncionario(Funcionario funcionario) {
        if (!funcionarios.contains(funcionario))
            funcionarios.add(funcionario);
        else throw new RuntimeException("Funcionário já foi adicionado");
    }

    public static void efetuarAumento(Integer id, Double porcentagem) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.id == id) {
                funcionario.salario += funcionario.salario * (porcentagem / 100);
                System.out.println("Aumento efetuado com sucesso!");
            }
            else throw new IllegalArgumentException("Esse id não existe ");
        }
    }

    @Override
    public String toString() {
        return  "Id: " + id +
                "\nNome: " + nome +
                "\nSalário: " + salario;
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

    public static String getFuncionarios() {
        return funcionarios.toString();
    }
}
