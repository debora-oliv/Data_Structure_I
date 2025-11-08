package stack.exercicio_6.questao_5;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        String texto = ")()";

        System.out.println(verificarBalanceamento(texto) ? "Está balanceado" : "Não está balanceado");
    }

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