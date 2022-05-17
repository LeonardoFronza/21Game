//LEONARDO FRONZA
public class Jogo
{
    //Responsavel por permitir a interessão ao usuario
    Teclado tec = new Teclado();
    
    //Cria um objeto de jogador1 e 2. Com seus nomes.
    Jogador jogador1 = new Jogador(tec.leString("⭲ Digite o nome do primeiro jogador: "));
    Jogador jogador2 = new Jogador(tec.leString("⭲ Digite o nome do segundo jogador: "));

    //Metodo que começa o jogo.
    public void comecaJogo()
    {                 
        //While que permite que o jogador continue jogando caso precise(looping)
        while(true) {
            int rodadas = 1;
            //Responsavel por ter apenas 3 rodadas para cada jogador.
            for(int i = 0; i < 3;i++) 
            {    
                //Mostra o nome dos jogadores uma vez, após ter digitado.
                if(i == 0) {
                System.out.println("\n➢Jogador 1: " + jogador1.getNome() + "\n➢Jogador 2: " + jogador2.getNome()); 
                System.out.println();
                }    
                
                //Mostra as rodadas que os jogadores estão
                System.out.println("-----------⮚RODADA: " + rodadas +"⮘------------");
                
                //Faz a interessão do jogador com o jogo. Perguntando se quer jogar os dados ou passar.
                System.out.println(jogador1.getNome() + " escolha uma das opções abaixo para jogar!");
                int escolhaUser = tec.leInt("1)Jogar os Dados\n2)Passar a vez"); 
                
                //Caso o usuario escolha a opção jogar os dados, entra no if e no if executa o metodo jogador1(). Que é responsavel pelas jogadas.
                if(escolhaUser == 1) 
                   jogador1();
                
                //Caso o usuario escolha a opção passar a vez, da msm que o proximo jogador irá jogar.
                if(escolhaUser == 2){
                    System.out.println("Você passou a sua vez para o: " + jogador2.getNome() + "\n");
                 }
                
                //Faz a interessão do jogador com o jogo. 
                System.out.println(); 
                System.out.println("______________________________");   
                System.out.println("O " + jogador1.getNome() + " finalizou sua vez!"); 
                System.out.println("______________________________");  
                
                //Perguntando se quer jogar os dados ou passar (Agora para o jogador2).
                System.out.println(jogador2.getNome() + " escolha uma das opções abaixo para jogar!");
                escolhaUser = tec.leInt("1)Jogar os Dados\n2)Passar a vez"); 
                
                //Caso o usuario escolha a opção jogar os dados, entra no if e no if executa o metodo jogador2(). Que é responsavel pelas jogadas.
                if(escolhaUser == 1) 
                   jogador2();
                
                //Caso o usuario escolha a opção passar a vez, da msm que o proximo jogador irá jogar.
                if(escolhaUser == 2){
                    System.out.println("Você passou a sua vez para o: " + jogador1.getNome() + "\n");
                }
                
                //Conta o numeros de vezes que os jogadores já jogaram;
                rodadas++;
            }
            
            //Da espaço para mostrar o resultado final.
            System.out.println("\n\n\n\n\n\n\n");
            
            //Mostra a soma total dos pontos de cada jogador individual.
            System.out.println("\n✅ RESULTDADO FINAL DO JOGO DO 21\n");
            System.out.println("» Total de pontos finais do " +jogador1.getNome() + ": " + jogador1.getQtdPontos() + "\n» Total de pontos finais do "+jogador2.getNome() + ": " + jogador2.getQtdPontos());
            
            //if responsaveis por vereficar qual jogador foi o vencedor.
            if(jogador1.getQtdPontos() > 21 && jogador2.getQtdPontos() > 21){
                System.out.println("✘ Todos os Jogadores passaram de 21 pontos. Jogo EMPATADO!");
            }else if(jogador1.getQtdPontos() > 21) {
                System.out.println("☑" + jogador2.getNome() + " venceu o jogo!");
            }else if(jogador2.getQtdPontos() > 21) {
                System.out.println("☑" + jogador1.getNome() + " venceu o jogo!");
            }else if(jogador1.getQtdPontos() > jogador2.getQtdPontos()) {
                System.out.println("☑" + jogador1.getNome() + " venceu o jogo!");
            }else if(jogador2.getQtdPontos() > jogador1.getQtdPontos()){
                System.out.println("☑" + jogador2.getNome() + " venceu o jogo!");
            }else{
                System.out.println("✘ EMPATADO!");
            }
            
            //Mostra as opçoes aos jogadores, dando a escolha de continuar jogando ou parar.
            System.out.println("______________________________");
            System.out.println("➽1)Continuar jogando \n➽2)Sair do jogo");
            System.out.println("______________________________");
            int escolhaDoJogador = tec.leInt("Digite 1 ou 2: ");
            
            //Se a escolha for parar, o break é acionado terminando o jogo.
            if(escolhaDoJogador == 2) 
                break;
            
            //Zera os pontos do jogador, caso a escolha seja continuar jogando.
            jogador1.setQtdPontos(0);
            jogador2.setQtdPontos(0);
        }
    }
    
    public Jogador jogador1() 
    {
        //Declarando Atributos
        int jogadaDadoBranco,jogadaDadoVermelho,somaBranco,totalDePontos,somaVermelho = 0;
        
        //Jogando o Dado Branco
        System.out.println("________________________________________");
        jogadaDadoBranco = jogador1.getDadoBranco().jogada();
        
        System.out.println("➢ " + jogador1.getNome() + " jogou o dado branco! \n➢ O seu resultado foi: " + jogadaDadoBranco);
        
        //Somando o valor do dado com os pontos
        somaBranco = jogadaDadoBranco;   
        
        //Intereção do jogador com a plataforma.
        System.out.println("________________________________________");
        int jogarDadoVermelho = tec.leInt("Digite 1 para jogar o dado vermelho: ");
        
        while(jogarDadoVermelho != 1)
            jogarDadoVermelho = tec.leInt("Digite 1 para jogar o dado vermelho: ");
        
        if(jogarDadoVermelho == 1) 
        {
            //Jogando o Dado vermelho
            System.out.println("________________________________________");
            jogadaDadoVermelho = jogador1.getDadoVermelho().jogada();
            System.out.println("➢ " + jogador1.getNome() + " jogou o dado Vermelho! \n➢O seu resultado foi: " + jogadaDadoVermelho);
            
            //Vereficando se o valor sorteado é 6, para dobrar seu valor.
            if(jogadaDadoVermelho == 6)
            {   
                System.out.println("\n-----------⮚ATENÇÃO!⮘-----------");
                System.out.println("Parabéns você tirou 6! Seu resultado vai ser Dobrado!");
                somaVermelho = 12;
            }
            else
            {
                //Caso o valor sorteado não seja 6, ele soma o valor normal.
                somaVermelho = jogador1.getQtdPontos() + jogadaDadoVermelho;
            }
        }      
        
        //Registra o total de pontos do Jogador.
        jogador1.setQtdPontos(somaVermelho + somaBranco);
               
        //Retorna ao jogador o total de pontos.
        System.out.println("");
        
        totalDePontos = jogador1.getQtdPontos();
        System.out.println("☞ O total de pontos do " + jogador1.getNome() +" é: " + totalDePontos);
      
        return new Jogador(jogador1.getNome());
    }
    
    public Jogador jogador2() 
    {
        //Declarando Atributos
        int jogadaDadoBranco,jogadaDadoVermelho,somaBranco,totalDePontos,somaVermelho = 0;
        
        //Jogando o Dado Branco
        System.out.println("________________________________________");
        jogadaDadoBranco = jogador2.getDadoBranco().jogada();
        
        System.out.println("➢ " + jogador2.getNome() + " jogou o dado branco! \n➢ O seu resultado foi: " + jogadaDadoBranco);
        
        //Somando o valor do dado com os pontos
        somaBranco = jogadaDadoBranco;   
        
        //Intereção do jogador com a plataforma.
        System.out.println("________________________________________");
        int jogarDadoVermelho = tec.leInt("Digite 1 para jogar o dado vermelho: ");
        
        while(jogarDadoVermelho != 1)
            jogarDadoVermelho = tec.leInt("Digite 1 para jogar o dado vermelho: ");
        
        if(jogarDadoVermelho == 1) 
        {
            //Jogando o Dado vermelho
            System.out.println("________________________________________");
            jogadaDadoVermelho = jogador2.getDadoVermelho().jogada();
            System.out.println("➢ " + jogador2.getNome() + " jogou o dado Vermelho! \n➢ O seu resultado foi: " + jogadaDadoVermelho);
            
            //Vereficando se o valor sorteado é 6, para dobrar seu valor.
            if(jogadaDadoVermelho == 6)
            {   
                System.out.println("\n-----------⮚ATENÇÃO!⮘-----------");
                System.out.println("Parabéns você tirou 6! Seu resultado vai ser Dobrado!");
                somaVermelho = 12;
            }
            else
            {
                //Caso o valor sorteado não seja 6, ele soma o valor normal.
                somaVermelho = jogador2.getQtdPontos() + jogadaDadoVermelho;
            }
        }      
        
        //Registra o total de pontos do Jogador.
        jogador2.setQtdPontos(somaVermelho + somaBranco);
               
        //Retorna ao jogador o seu total de pontos.
        System.out.println("");
        
        totalDePontos = jogador2.getQtdPontos();
        System.out.println("☞ O total de pontos do "+ jogador2.getNome() +" é: " + totalDePontos);
        
        return new Jogador(jogador2.getNome());
    }
    
    //Quando o jogo é finalizado no break, quem aparece é o metodo toString.
    public String toString() {
        return "JOGO FINALIZADO";
    }
}
