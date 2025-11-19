package exercicio_6;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        System.out.println("-----QUESTÃO 1-----");
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

        System.out.println("-----QUESTÃO 2-----");
        String texto = "boi";
        System.out.println(ehPalindromo(texto) ? "É palindromo" : "Não é palindromo");

        System.out.println("-----QUESTÃO 3-----");
        System.out.println(pilha);
        System.out.println(inverterPilha(pilha));

        System.out.println("-----QUESTÃO 4-----");
        System.out.println(somarElementos(pilha));

        System.out.println("-----QUESTÃO 5-----");
        texto = ")()";
        System.out.println(verificarBalanceamento(texto) ? "Está balanceado" : "Não está balanceado");
    }

    //Q1
    public static void removerMaioresQue(Stack<Integer> pilha, int limite) {
        Stack<Integer> auxiliar = new Stack<>();
        while(!pilha.isEmpty()) {
            if (pilha.peek() <= limite) auxiliar.push(pilha.peek());
            pilha.pop();
        }
        pilha.addAll(auxiliar);
    }

    //Q2
    public static boolean ehPalindromo(String texto) {
        Stack<Character> original = new Stack<>();

        for (char c : texto.toCharArray()) {
            original.push(c);
        }

        Stack<Character> invertida = new Stack<>();
        Stack<Character> auxiliar = new Stack<>();
        auxiliar.addAll(original);

        while (!auxiliar.isEmpty()) {
            invertida.push(auxiliar.pop());
        }

        for (int i = 0; i < original.size(); i++) {
            if (original.pop() != invertida.pop()) return false;
        }
        return true;
    }

    //Q3
    public static Stack<Integer> inverterPilha(Stack<Integer> original) {
        Stack<Integer> invertida = new Stack<>();

        int tamanho = original.size();

        for (int i = 0; i < tamanho; i++) {
            invertida.push(original.pop());
        }
        return invertida;
    }

    //Q4
    public static int somarElementos(Stack<Integer> pilha) {
        Stack<Integer> auxiliar = new Stack<>();
        auxiliar.addAll(pilha);
        int soma = 0;

        while(!auxiliar.isEmpty()) {
            soma += auxiliar.pop();
        }
        return soma;
    }

    //Q5
    public static boolean verificarBalanceamento(String texto) {
        Stack<Character> parenteses = new Stack<>();

        for (char c : texto.toCharArray()) {
            if (c == '(') parenteses.push(c);
            else {
                if (parenteses.isEmpty()) return false;
                parenteses.pop();
            }
        }
        return parenteses.isEmpty();
    }
}