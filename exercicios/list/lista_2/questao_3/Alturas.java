package list.lista_2.questao_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alturas {
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
            System.out.print("Altura: ");
            Double altura = input.nextDouble();

            pessoas.add(new Pessoa(nome, idade, altura));
        }

        System.out.println("Altura média: " + calcularMediaAltura(pessoas));
        System.out.println("Pessoas com menos de 16 anos: " + menores16Anos(pessoas));
    }

    public static Double calcularMediaAltura(List<Pessoa> pessoas) {
        double media = 0.0;
        for (var pessoa : pessoas) {
            media += pessoa.getAltura();
        }
        return media / pessoas.size();
    }

    public static String menores16Anos (List<Pessoa> pessoas) {
        double menores = 0;
        String s = "";
        for (var pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                menores++;
                s += pessoa.getNome() + "\n";
            }
        }
        return (menores * 100) / pessoas.size() + "%" + '\n' + s;
    }
}