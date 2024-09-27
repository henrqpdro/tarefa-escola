package domain;

import java.util.List;

public class Curso {
    private Integer codigo;
    private String descricao;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;
    
    public void cadastrar (){
        
    }

    public Curso(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
