package lista_2.questao_7;

import lista_2.questao_3.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lista_2.questao_2.SomaLista.imprimir;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantos elementos vai ter a lista? ");
            n = input.nextInt();
        } while (n < 0);

        List<Double> numeros = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextDouble());
        }

        System.out.println("MEDIA DA LISTA = " + calcularMedia(numeros));

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        imprimir(abaixoDaMedia(numeros));
    }

    public static Double calcularMedia(List<Double> numeros) {
        double media = 0.0;
        for (var numero : numeros) {
            media += numero;
        }
        return media / numeros.size();
    }

    public static List<Double> abaixoDaMedia (List<Double> numeros) {
        List<Double> abaixoDaMedia = new ArrayList<>(numeros.size());
        for (var numero : numeros) {
            if (numero < calcularMedia(numeros)) {
                abaixoDaMedia.add(numero);
            }
        }
        return abaixoDaMedia;
    }
}
