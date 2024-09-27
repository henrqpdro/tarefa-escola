package domain;

public class Avaliacao {

    private Aluno aluno;
    private Turma turma;
    private Integer nota1;
    private Integer nota2;
    private Integer notaProvaFinal;
    private Double frequencia;

    public void lancarAprovacao() {

    }

    public void calcularAprovacao() {

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Integer getNota1() {
        return nota1;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public Integer getNotaProvaFinal() {
        return notaProvaFinal;
    }

    public void setNotaProvaFinal(Integer notaProvaFinal) {
        this.notaProvaFinal = notaProvaFinal;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Double frequencia) {
        this.frequencia = frequencia;
    }

    public Avaliacao(Aluno aluno, Turma turma, Integer nota1, Integer nota2, Integer notaProvaFinal,
            Double frequencia) {
        this.aluno = aluno;
        this.turma = turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaProvaFinal = notaProvaFinal;
        this.frequencia = frequencia;
    }

    
}
