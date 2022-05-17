//LEONARDO FRONZA
public class Jogador
{
    //Atrubutos
    private String nome;
    private int qtdPontos = 0;
    
    //Criando um obj dos dados.
    Dado dadoBranco = new Dado("Branco");
    Dado dadoVermelho = new Dado("Vermelho");
    
    //Construtor
    public Jogador(String nome)
    {
        this.nome = nome;
    }
    
    //Metodos de acessos.
    public String getNome() {
        return nome;
    }
    
    public int getQtdPontos() {
        return qtdPontos;
    }
    
    public Dado getDadoBranco() {
        return dadoBranco;
    }
    
    public Dado getDadoVermelho() {
        return dadoVermelho;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setQtdPontos(int qtdPontos) {
        this.qtdPontos = qtdPontos;
    }
    
    public void setDadoBranco(Dado dadoBranco) {
        this.dadoBranco = dadoBranco;
    }
    
    public void setDadoVermelho(Dado dadoVermelho) {
        this.dadoVermelho = dadoVermelho;
    }
}
