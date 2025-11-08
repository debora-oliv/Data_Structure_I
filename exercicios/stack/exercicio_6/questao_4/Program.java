package stack.exercicio_6.questao_4;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(5);
        pilha.push(1);
        pilha.push(3);
        pilha.push(2);
        pilha.push(6);
        pilha.push(7);
        pilha.push(9);

        System.out.println(somarElementos(pilha));
    }

    public static int somarElementos(Stack<Integer> pilha) {
        Stack<Integer> auxiliar = new Stack<>();
        auxiliar.addAll(pilha);

        int soma = 0;

        while(!auxiliar.isEmpty()) {
            soma += auxiliar.pop();
        }
        return soma;
    }
}
