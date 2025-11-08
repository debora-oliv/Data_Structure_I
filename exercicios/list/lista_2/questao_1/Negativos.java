package list.lista_2.questao_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Quantos numeros voce vai digitar? ");
            n = input.nextInt();
        } while (n < 0 || n > 10);

        List<Integer> numeros = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um numero: ");
            numeros.add(input.nextInt());
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(var numero : numeros) {
            if (numero < 0) System.out.println(numero);
        }
    }
}
