//LEONARDO FRONZA
public class MenuJogo
{   
    //Metodo criado para o menu do jogo.
    public void menuDoJogo() {
        Teclado tec = new Teclado();
        
        //Da boas vindas ao jogadores
        System.out.println("BEM VINDO AO JOGO 21! - LEONARDO FRONZA");
         
        //While responsavel por mostrar a regra e fazer um "Menu"
        while(true) {
            //Mostra as opções ao usuario
            System.out.println("🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜🢜");
            System.out.println("-------➢1)START GAME  ➢2)READ THE RULES-------");
            int respostaUser = tec.leInt();
            
            //Caso o jogador escolha a opção 2, irá entrar no if, o qual vai mostrar as regras do jogo e dar uma opção de voltar ao menu.
            if(respostaUser == 2){
                System.out.println("➢RULES");
                System.out.println("➬ Se o jogador passar a vez, não joga os dados");
                System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
                System.out.println("➬ Se o jogador escolher jogar os dados, joga primeiro o dado branco. \n O valor do dado branco soma-se aos pontos que ele possui (por exemplo, se o jogador tinha 5 pontos e tirou 3 no dado branco, agora ele tem 8 pontos). \nLogo em seguida, o jogador joga o dado vermelho.\nSe o valor do dado vermelho for 6, este valor é duplicado e somado aos pontos que ele já possui \n(por exemplo, se o jogador tinha 8 pontos após jogar o dado branco, e tirou 6 no dado vermelho, ele\nagora tem 8 + (2 x 6) = 20 pontos). Qualquer outro valor no dado vermelho é simplesmente\nsomado aos pontos do jogador, assim como o dado branco.");
                System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
                System.out.println("➬ Depois que um jogador passa a vez ou joga os dois dados, é a vez do outro escolher se joga ou se\npassa a vez, e assim o jogo continua. Uma rodada termina quando todos os jogadores fizerem sua ação\n(seja esta ação passar a vez ou jogar). O jogo termina após 3 rodadas.");
                
                respostaUser = tec.leInt("❮ 3)Back");
                
                while(respostaUser != 3)
                    respostaUser = tec.leInt("Digite 3 para voltar ao menu!");   
            }
    
            //Caso o usuairo escolha 1, será finalizado o while e iniciado o jogo. 
            if(respostaUser == 1)
                break;
        }
    }
}
