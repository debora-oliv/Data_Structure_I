package stack.exercicio_6.questao_2;

import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        String texto = "boi";

        System.out.println(ehPalindromo(texto) ? "É palindromo" : "Não é palindromo");
    }

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
}
