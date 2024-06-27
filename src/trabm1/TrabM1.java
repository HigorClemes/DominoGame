package trabm1;

import java.util.Random;
import java.util.Scanner;

public class TrabM1 {
 
    Random gerador = new Random();

    
    public static void main(String[] args) {
        int a;
        
        Scanner sc = new Scanner ( System.in );
       
        do {
            domino d = new domino();
            d.criaPecas();    
            System.out.println("-----------|| Menu ||-----------\n");
            System.out.println("--------|| 1 - Jogar ||---------\n--------|| 2 - Sobre ||---------\n--------|| 3 - Sair  ||---------\n");
            System.out.print("Digite uma opção: \n");
            a = sc.nextInt();
        
        switch(a){
            case 1:{    
                Jogador p1 = new Jogador(d);
                p1.pecasJogador( "Jogador 1");
                
                Jogador p2 = new Jogador(d);
                p2.pecasJogador( "Jogador 2");

                d.mostrarPecas();

                partida play = new partida();
                play.iniciarPartida(p1.pegarPeca(0));
                p1.RemoverPeca(0);
                p1.pecasJogador("Jogador1");

                System.out.println("\tJogador 1 iniciou a partida");
                play.mostrarPontas();

                int i = 1;
                int n, aux;
                do {
                    if (play.vezJogador(i) == 1){
                        for (n=0; n<p1.getJogador().size(); n++){
                            aux = p1.getJogador().size();
                            if( play.validarPeca(p1.pegarPeca(n)) == true){
                                p1.pecasJogador("Jogador 1");
                                p1.pecasJogador("Jogador 1", n);
                                play.mostrarPontas();
                                p1.RemoverPeca(n);
                                i = play.vezJogador(i);
                                d.mostrarPecas();
                                break;
                            }
                            else if ((n+1) == aux){
                                if(d.getPecas().size() < 1) break;
                                p1.adicionarPeca(d.pegarPecaMesa(0));
                                p1.pecasJogador("Jogador 1");
                                d.RemoverPeca(0);
                                d.mostrarPecas();
                            }
                        }



                    }

                    else if (play.vezJogador(i) == 2){
                        for (n=0; n<p2.getJogador().size(); n++){
                            aux = p2.getJogador().size();
                            if( play.validarPeca(p2.pegarPeca(n)) == true){
                                p2.pecasJogador("Jogador 2");
                                p2.pecasJogador("Jogador 2", n);
                                play.mostrarPontas();
                                p2.RemoverPeca(n);        
                                i = play.vezJogador(i);
                                d.mostrarPecas();
                                break;
                            }
                            else if ((n+1) == aux){
                                if(d.getPecas().size() < 1) break;
                                p2.adicionarPeca(d.pegarPecaMesa(0));
                                p2.pecasJogador("Jogador 2");
                                d.RemoverPeca(0);
                                d.mostrarPecas();
                            }
                        }      
                    }
                if (play.Vencedor(p1, p2, d) == true) {
                    break;
                }
                } while (p1.getJogador().size() > 1 || p2.getJogador().size() > 1 || d.getPecas().size() > 1);
                break;
        }
        case 2:{
            if (a == 2) {
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("Regras do jogo: \n_\n *O Jogador 1 inicia o jogo com a primeira peça dele \n_\n *Jogador que ficar sem peças primeiro vence\n_");
                System.out.println(" *Caso o jogador que não haver  peças compatível para a jogada, \ndeve comprar as peças da mesa até ter alguma compativel com a jogada \n_");
                System.out.println(" *Caso não haver peças na mesa e nenhum jogador tiver peças compativeis com a mesa,\n O jogador com menos peça ganha");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("\t---------Esse jogo foi Desenvolvido por: Higor Clemes e Lucas Ouriques---------\n\n");
                System.out.println("\n--------|| 1 - Voltar ||---------\n--------|| 3 - Sair   ||---------\n");
                int b = sc.nextInt();
                a = b;
                break;
            }
        }
        case 3 : break;
        default:
            System.out.println("Opção inválida.");
      }
        
        }while (a != 3 );
    }
}

