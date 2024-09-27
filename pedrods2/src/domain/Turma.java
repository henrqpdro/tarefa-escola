package domain;

import java.util.List;

public class Turma {

    private Integer ano;
    private Integer semestre;
    private Integer diasSemana;
    private String horarios;
    private Disciplina disciplina;
    public Turma(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    private List <Avaliacao> avaliacoes;

    private void abrirTurma(){

    }
    private void alocarProfessor(){

}
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public Integer getSemestre() {
        return semestre;
    }
    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
    public Integer getDiasSemana() {
        return diasSemana;
    }
    public void setDiasSemana(Integer diasSemana) {
        this.diasSemana = diasSemana;
    }
    public String getHorarios() {
        return horarios;
    }
    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
    public Turma(Integer ano, Integer semestre, Integer diasSemana, String horarios) {
        this.ano = ano;
        this.semestre = semestre;
        this.diasSemana = diasSemana;
        this.horarios = horarios;
    }
    
}
