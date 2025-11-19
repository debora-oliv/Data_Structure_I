package lista_2.questao_10;

public class Aluno {
    private String nome;
    private Double notaSemestre1;
    private Double notaSemestre2;

    public Aluno(String nome, Double notaSemestre1, Double notaSemestre2) {
        this.nome = nome;
        this.notaSemestre1 = notaSemestre1;
        this.notaSemestre2 = notaSemestre2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaSemestre1() {
        return notaSemestre1;
    }

    public void setNotaSemestre1(Double notaSemestre1) {
        this.notaSemestre1 = notaSemestre1;
    }

    public Double getNotaSemestre2() {
        return notaSemestre2;
    }

    public void setNotaSemestre2(Double notaSemestre2) {
        this.notaSemestre2 = notaSemestre2;
    }

    public double calcularMedia() {
        return (notaSemestre1 + notaSemestre2) / 2.0;
    }
}
