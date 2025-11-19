package lista_2.questao_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lista_2.questao_2.SomaLista.imprimir;

public class Pares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantos numeros voce vai digitar? ");
            n = input.nextInt();
        } while (n < 0);

        List<Integer> numeros = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextInt());
        }

        System.out.println("\nNUMEROS PARES:");
        imprimir(listarPares(numeros));

        System.out.print("\nQUANTIDADE DE PARES = " + listarPares(numeros).size());
    }

    public static List<Integer> listarPares(List<Integer> numeros) {
        List<Integer> pares = new ArrayList<>();
        for (var numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        return pares;
    }
}
