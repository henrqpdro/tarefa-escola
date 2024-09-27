package domain;

public class Professor extends Pessoa {

    private String titulacaoMaxima;
    public void cadastrar () {

    }
    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }
    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }
    public Professor(String nome, String endereco, String telefone, String titulacaoMaxima) {
        super(nome, endereco, telefone);
        this.titulacaoMaxima = titulacaoMaxima;
    }
    
}
