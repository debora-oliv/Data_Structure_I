package lista_2.questao_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lista_2.questao_2.SomaLista.imprimir;

public class SomaListas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantos valores vai ter cada lista? ");
            n = input.nextInt();
        } while (n < 0);

        List<Integer> listaA = new ArrayList<>(n);
        System.out.println("Digite os valores da lista A:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um numero: ");
            listaA.add(input.nextInt());
        }

        List<Integer> listaB = new ArrayList<>(n);
        System.out.println("Digite os valores da lista B:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um numero: ");
            listaB.add(input.nextInt());
        }

        System.out.println("LISTA RESULTANTE:");
        imprimir(somarLista(listaA, listaB));
    }

    public static List<Integer> somarLista(List<Integer> listaA, List<Integer> listaB) {
        List<Integer> listaC = new ArrayList<>();
        for (int i = 0; i < listaA.size(); i++) {
            listaC.add(listaA.get(i) + listaB.get(i));
        }
        return listaC;
    }
}