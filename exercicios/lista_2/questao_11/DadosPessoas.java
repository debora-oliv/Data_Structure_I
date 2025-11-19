package lista_2.questao_11;

import lista_2.questao_3.Genero;
import lista_2.questao_3.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantas pessoas serao digitadas? ");
            n = input.nextInt();
        } while (n < 0);

        List<Pessoa> pessoas = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            System.out.printf("Altura da %sª pessoa: ", i);
            Double altura = input.nextDouble();
            System.out.printf("Gênero da %sª pessoa: ", i);
            char generoChar = input.next().toUpperCase().charAt(0);
            Genero genero = (generoChar == 'M') ? Genero.MASCULINO : Genero.FEMININO;

            pessoas.add(new Pessoa(altura, genero));
        }

        System.out.printf("\nMenor altura = %.2f\n", calcularMenorAltura(pessoas));
        System.out.printf("Maior altura = %.2f\n", calcularMaiorAltura(pessoas));
        System.out.printf("Média de altura das mulheres = %.2f\n", calcularMediaMulheres(pessoas));
        System.out.println("Número de homens = " + contarHomens(pessoas));
    }

    public static double calcularMenorAltura(List<Pessoa> pessoas) {
        double menor = pessoas.get(0).getAltura();
        for (Pessoa p : pessoas) {
            if (p.getAltura() < menor) menor = p.getAltura();
        }
        return menor;
    }

    public static double calcularMaiorAltura(List<Pessoa> pessoas) {
        double maior = pessoas.get(0).getAltura();
        for (Pessoa p : pessoas) {
            if (p.getAltura() > maior) maior = p.getAltura();
        }
        return maior;
    }

    public static double calcularMediaMulheres(List<Pessoa> pessoas) {
        double soma = 0.0;
        int cont = 0;
        for (Pessoa p : pessoas) {
            if (p.getGenero() == Genero.FEMININO) {
                soma += p.getAltura();
                cont++;
            }
        }
        return cont == 0 ? 0.0 : soma / cont;
    }

    public static int contarHomens(List<Pessoa> pessoas) {
        int cont = 0;
        for (Pessoa p : pessoas) {
            if (p.getGenero() == Genero.MASCULINO) cont++;
        }
        return cont;
    }
}