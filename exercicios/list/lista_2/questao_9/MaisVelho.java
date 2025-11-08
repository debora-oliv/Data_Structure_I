package list.lista_2.questao_9;

import list.lista_2.questao_3.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantas pessoas serão digitadas? ");
            n = input.nextInt();
        } while (n < 0);

        List<Pessoa> pessoas = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            System.out.printf("Dados da %sª pessoa: \n", i);
            System.out.print("Nome: ");
            String nome = input.next();
            System.out.print("Idade: ");
            Integer idade = input.nextInt();

            pessoas.add(new Pessoa(nome, idade));
        }

        double maiorIdade = 0.0;
        String maisVelho = "";

        for (Pessoa p : pessoas) {
            if (p.getIdade() > maiorIdade) {
                maiorIdade = p.getIdade();
                maisVelho = p.getNome();
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + maisVelho);
    }
}