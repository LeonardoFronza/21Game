//LEONARDO FRONZA
public class Dado
{
    //Atributos
    private int qtdLados = 6;
    private String cor;
    
    //Construtor
    public Dado(String cor)
    {
        this.cor = cor;
    }
    
    //Metodos de acessos
    public int getLados() {
        return qtdLados;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setLados(int qtdLados) {
        this.qtdLados = qtdLados;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    //Sorteia um numero aleatorio.
    public int jogada() {
        //Random random = new Random();
        int valor = 1 + (int) (Math.random() * 6);
        //int valor = random.nextInt(6);
        return valor;
    }
}
