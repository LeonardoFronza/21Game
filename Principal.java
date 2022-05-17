//LEONARDO FRONZA
public class Principal
{
    public static void main(String[] args) {
        //Inicia com o menu jogo
        MenuJogo menu = new MenuJogo();
        menu.menuDoJogo();
        
        //Após inica o jogo
        Jogo jogo = new Jogo();
        jogo.comecaJogo();
        System.out.println(jogo);
    }
}
