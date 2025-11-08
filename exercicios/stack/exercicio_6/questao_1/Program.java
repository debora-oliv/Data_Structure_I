package stack.exercicio_6.questao_1;

import java.util.Collections;
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

        removerMaioresQue(pilha, 5);

        System.out.println(pilha);
    }

    public static void removerMaioresQue(Stack<Integer> pilha, int limite) {
        Stack<Integer> auxiliar = new Stack<>();
        while(!pilha.isEmpty()) {
            if (pilha.peek() <= limite) auxiliar.push(pilha.peek());
            pilha.pop();
        }
        pilha.addAll(auxiliar);
    }

    /*
    public static void removerMaioresQueV2(Stack<Integer> pilha, int limite) {
        Collections.sort(pilha);
        while(pilha.peek() > limite) {
            pilha.pop();
        }
    }
    */
}