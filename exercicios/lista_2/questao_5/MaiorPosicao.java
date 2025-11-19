package lista_2.questao_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Quantos numeros voce vai digitar? ");
            n = input.nextInt();
        } while (n < 0);

        List<Double> numeros = new ArrayList<>(n);

        double maior = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextDouble());
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
                index = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + index);
    }
}