package list.lista_2.questao_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantos elementos vai ter a lista? ");
            n = input.nextInt();
        } while (n < 0);

        List<Integer> numeros = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextInt());
        }

        System.out.print("MEDIA DOS PARES = ");
        calcularMediaPares(numeros);
    }

    public static Boolean verificarPares(List<Integer> numeros) {
        for (var numero : numeros) {
            if (numero % 2 == 0) return true;
        }
        return false;
    }

    public static void calcularMediaPares(List<Integer> numeros) {
        double media = 0.0;
        int pares = 0;
        if (verificarPares(numeros)) {
            for (var numero : numeros) {
                if (numero % 2 == 0) {
                    media += numero;
                    pares++;
                }
            }
            System.out.println(media / pares);
            return;
        }
        System.out.println("NENHUM NUMERO PAR");
    }
}