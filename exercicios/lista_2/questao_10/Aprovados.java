package lista_2.questao_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantos alunos serão digitados? ");
            n = input.nextInt();
        } while (n < 0);

        List<Aluno> alunos = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %s° aluno: \n", i);
            String nome = input.next();
            Double nota1 = input.nextDouble();
            Double nota2 = input.nextDouble();

            alunos.add(new Aluno(nome, nota1, nota2));
        }

        System.out.println("Alunos aprovados: ");
        imprimirAprovados(conferirAprovados(alunos));
    }

    public static List<Aluno> conferirAprovados(List<Aluno> alunos) {
        List<Aluno> aprovados = new ArrayList<Aluno>();
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() > 6.0) aprovados.add(aluno);
        }
        return aprovados;
    }

    public static void imprimirAprovados (List<Aluno> aprovados) {
        for (Aluno aluno : aprovados) {
            System.out.println(aluno.getNome());
        }
    }
}
