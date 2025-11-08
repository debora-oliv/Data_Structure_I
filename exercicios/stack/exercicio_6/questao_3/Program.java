package stack.exercicio_6.questao_3;

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

        System.out.println(pilha);

        System.out.println(inverterPilha(pilha));
    }

    public static Stack<Integer> inverterPilha(Stack<Integer> original) {
        Stack<Integer> invertida = new Stack<>();

        int tamanho = original.size();

        for (int i = 0; i < tamanho; i++) {
            invertida.push(original.pop());
        }
        return invertida;
    }
}
