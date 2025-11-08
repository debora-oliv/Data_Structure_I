package list.exercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");
        var n = input.nextInt();
        List<Funcionario> funcionarios = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            System.out.printf("Funcionário #%s", i + "\n");
            System.out.print("Nome: ");
            var nome = input.next();
            System.out.print("Salário: ");
            var salario = input.nextDouble();

            funcionarios.add(new Funcionario(salario, nome));
        }

        System.out.print("ID do funcionário que receberá o aumento: ");
        var id = input.nextInt();

        System.out.print("Porcentagem do aumento: ");
        var aumento = input.nextDouble();

        efetuarAumento(funcionarios, id, aumento);

        System.out.print('\n');
        System.out.println("Lista de funcionários:");
        listarFuncionarios(funcionarios);
    }

    public static void listarFuncionarios(List<Funcionario> funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public static void efetuarAumento(List<Funcionario> funcionarios, Integer id, Double porcentagem) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                funcionario.setSalary(funcionario.getSalario() + funcionario.getSalario() * (porcentagem / 100));
                System.out.println("Aumento efetuado com sucesso!");
                return;
            }
        }
        throw new IllegalArgumentException("Esse ID não existe");
    }
}
