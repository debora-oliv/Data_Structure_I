package list.lista_2.questao_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantos numeros voce vai digitar? ");
            n = input.nextInt();
        } while (n < 0);

        List<Double> numeros = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextDouble());
        }

        System.out.print("VALORES = ");
        imprimir(numeros);

        System.out.println("SOMA = " + calcularSoma(numeros));

        System.out.println("MÉDIA = " + calcularMedia(numeros));
    }

    public static <T> void imprimir(List<T> array) {
        for (var num : array) {
            System.out.print(num + " ");
        }
        System.out.print('\n');
    }

    public static Double calcularSoma(List<Double> array) {
        double soma = 0;
        for (var num : array) {
            soma += num;
        }
        return soma;
    }

    public static Double calcularMedia(List<Double> array) {
        return calcularSoma(array) / array.size();
    }
}
