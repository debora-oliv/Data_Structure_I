package exercicio_4;

public class Investimento implements Comparable<Investimento>{
    @Override
    public int compareTo(Investimento o) {
        return -this.valorLiquido().compareTo(o.valorLiquido());
    }

    private Long cpf;

    private String tipoInvestimento;

    private Double taxa;

    private Integer tempo;

    private Double capitalInicial;

    private static final double CDI = 4.9;

    public Investimento(Long cpf, String tipoInestimento, Double taxa, Integer tempo, Double capitalInicial) {
        this.cpf = cpf;
        this.tipoInvestimento = tipoInestimento;
        this.taxa = taxa;
        this.tempo = tempo;
        this.capitalInicial = capitalInicial;
    }

    public Double tx() {
        return (this.taxa/100) * (CDI/100);
    }

    public Double valorBruto() {
        return capitalInicial * Math.pow(1+tx(), tempo/360);
    }

    public Double juros() {
        return valorBruto() - capitalInicial;
    }

    public Double valorLiquido() {
        if (this.tipoInvestimento.equals("LCI") || this.tipoInvestimento.equals("LCA"))
            return valorBruto();
        if (this.tempo <= 180) return valorBruto() - juros() * 0.225;
        else if (this.tempo <= 360) return valorBruto() - juros() * 0.20;
        else if (this.tempo <= 720) return valorBruto() - juros() * 0.175;
        else return valorBruto() - juros() * 0.15;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s %.2f %.2f %.2f %.2f", cpf, tipoInvestimento, taxa, tempo, capitalInicial, valorBruto(), juros(), valorLiquido());
    }

    public Long getCPF() {
        return cpf;
    }

    public void setCPF(Long CPF) {
        this.cpf = CPF;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(Double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }
}
