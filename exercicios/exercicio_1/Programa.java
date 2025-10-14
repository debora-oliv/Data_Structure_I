package exercicio_1;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");
        var n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Funcionário #%s", i + "\n");
            System.out.print("Nome: ");
            var nome = input.next();
            System.out.print("Salário: ");
            var salario = input.nextDouble();

            Funcionario f = new Funcionario(salario, nome);
            System.out.println(f + "\n");
        }

        System.out.print("ID do funcionário que receberá o aumento: ");
        var id = input.nextInt();

        System.out.print("Porcentagem do aumento: ");
        var aumento = input.nextDouble();

        Funcionario.efetuarAumento(id, aumento);

        System.out.print('\n');
        System.out.println("Lista de funcionários:");
        Funcionario.listarFuncionarios();
    }
}
