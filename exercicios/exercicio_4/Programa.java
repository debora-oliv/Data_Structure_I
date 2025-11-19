package exercicio_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("exercicios/exercicio_4/entradaInvest.txt"));
        PrintWriter pw = new PrintWriter("exercicios/exercicio_4/saidaInvest.txt");

        String linha = "";
        String[] campos = null;
        List<Investimento> investimentos = new ArrayList<>();

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            campos = linha.split(" ");

            Long cpf = Long.parseLong(campos[0]);
            String tipoInestimento = campos[1];
            Double taxa = Double.parseDouble(campos[2]);
            Integer tempo = Integer.parseInt(campos[3]);
            Double capitalInicial = Double.parseDouble(campos[4]);

            investimentos.add(new Investimento(cpf, tipoInestimento, taxa, tempo, capitalInicial));
        }

        Collections.sort(investimentos);

        for (Investimento investimento : investimentos) {
            pw.println(investimento);
            investimento.valorBruto();
            investimento.juros();
            investimento.valorLiquido();
        }
        sc.close();
        pw.close();
    }
}
