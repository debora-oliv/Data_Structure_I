package lista_3;

public class Program {
    public static void main(String[] args) {
        System.out.println("-----QUESTÃO 1-----");
        String texto = "(){]{}";
        System.out.println(validarExpressao(texto) ? "Está balanceado" : "Não está balanceado");

        System.out.println("-----QUESTÃO 2-----");
        texto = "abbaca";
        System.out.println(removeDuplicatas(texto));

        System.out.println("-----QUESTÃO 3-----");
        int[] ingressos = {5, 1, 1, 1};
        var k = 0;
        System.out.println(tempoDeCompra(ingressos, k));

        System.out.println("-----QUESTÃO 4-----");
        int[] alunos = {1, 1, 1, 0, 0, 1};
        int[] lanches = {1, 0, 0, 0, 1, 1};
        System.out.println(contaAlunos(alunos, lanches));
    }

    //Q1
    public static boolean validarExpressao(String texto) {
        var parenteses = new Stack<Character>();
        var chaves = new Stack<Character>();
        var colchetes = new Stack<Character>();

        for (char c : texto.toCharArray()) {
            if (c == '(') parenteses.push(c);
            else if (c == ')') {
                if (parenteses.isEmpty()) return false;
                parenteses.pop();
            }
            if (c == '{') chaves.push(c);
            else if (c == '}') {
                if (chaves.isEmpty()) return false;
                chaves.pop();
            }
            if (c == '[') colchetes.push(c);
            else if (c == ']') {
                if (colchetes.isEmpty()) return false;
                colchetes.pop();
            }
        }
        return (parenteses.isEmpty() && chaves.isEmpty() && colchetes.isEmpty());
    }

    //Q2
    public static String removeDuplicatas(String texto) {
        Stack<Character> pilha = new Stack<>();

        for (char c : texto.toCharArray()) {
            if (!pilha.isEmpty() && pilha.peek() == c) {
                pilha.pop();
            } else {
                pilha.push(c);
            }
        }

        StringBuilder novoTexto = new StringBuilder();
        while (!pilha.isEmpty()) novoTexto.append(pilha.pop());

        return novoTexto.reverse().toString();
    }

    //Q3
    public static int tempoDeCompra(int[] ingressos, int k) {
        var fila = new Queue<int[]>();
        for (int i = 0; i < ingressos.length; i++) {
            fila.enqueue(new int[]{ ingressos[i], i });
        }
        var tempo = 0;
        while (!fila.isEmpty()) {
            int[] pessoa = fila.dequeue();
            pessoa[0]--;
            tempo++;

            if (pessoa[1] == k && pessoa[0] == 0) break;

            if (pessoa[0] > 0) fila.enqueue(new int[]{ pessoa[0], pessoa[1]});
        }
        return tempo;
    }

    //Q4
    public static int contaAlunos(int[] alunos, int[] lanches){
        var filaAlunos = new Queue<Integer>();
        var filaLanches = new Queue<Integer>();
        int tentativas = 0;

        for (var aluno : alunos) filaAlunos.enqueue(aluno);
        for (var lanche : lanches) filaLanches.enqueue(lanche);

        while (!filaLanches.isEmpty()) {
            int aluno = filaAlunos.dequeue();

            if (aluno == filaLanches.peek()) {
                filaLanches.dequeue();
                tentativas = 0;
            } else {
                filaAlunos.enqueue(aluno);
                tentativas++;
            }

            if (tentativas == filaAlunos.size()) break;
        }

        return filaAlunos.size();
    }
}