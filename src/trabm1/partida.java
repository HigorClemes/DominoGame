package trabm1;

import java.util.ArrayList;

public class partida {
    
    private int ponta1;
    private int ponta2;

    public void setPonta1 (int num){
        this.ponta1 = num;
    }

    public void setPonta2 (int num){
        this.ponta2 = num;
    }

    public int getPonta1 (){
        return ponta1;
    }

    public int getPonta2 (){
        return ponta2;
    }

    public void mostrarPontas(){
        System.out.println("\tAs Pontas são: [" + ponta1 + "|"  + ponta2 + "]\n");
    }
    
    public void iniciarPartida (peca pc){
        ponta1 = pc.lado1;
        ponta2 = pc.lado2;
        System.out.println(ponta1 + " " + ponta2);
    }

    public boolean validarPeca(peca pc){
        if (pc.lado1 == ponta1){
        this.ponta1 = pc.lado2;
        return true;
        } else if (pc.lado2 == ponta1){
        this.ponta1 = pc.lado1;
        return true;
        } else if (pc.lado1 == ponta2){
        this.ponta2 = pc.lado2;
        return true;
        } else if (pc.lado2 == ponta2){
        this.ponta2 = pc.lado1;
        return true;
        } else return false;

    }

    public int vezJogador (int player){
        if (player == 1){
        player = 2;
        } else if (player == 2){
        player = 1;
        } 
        return player;
    }
    private int aux = 0;
    public void SetAux (int n){
        aux = n; 
    }
    public int getAux (){
        return aux;
    }
    
    public boolean Vencedor (Jogador p1,Jogador p2, domino p){
       if (p1.getJogador().isEmpty()){
            System.out.println("\n\t-----------Jogador 1 ganhou-----------");  
            System.out.println("\n-----------As peças do Jogador 1 acabaram-----------\n");
            return true;
        } else if (p2.getJogador().isEmpty()) {
            System.out.println("\n\t-----------Jogador 2 ganhou-----------");
            System.out.println("\n-----------As peças do Jogador 2 acabaram-----------\n");
            return true;
        } else if (p1.getJogador().size() < p2.getJogador().size() && p.PecaMesa().isEmpty()){
            System.out.println("\n\t\t-----------Jogador 1 ganhou-----------");
            System.out.println("\n-----------Os jogadores não possuem mais peças que possam ser jogadas-----------");
            System.out.println("\n-----------Portanto Jogador 1 possui menos peças do que o Jogador 2-----------\n");
            return true;
        }
        else if (p2.getJogador().size() < p1.getJogador().size() && p.PecaMesa().isEmpty()){
            System.out.println("\n\t\t-----------Jogador 2 ganhou-----------");
            System.out.println("\n-----------Os jogadores não possuem mais peças que possam ser jogadas-----------");
            System.out.println("\n-----------Portanto Jogador 2 possui menos peças do que o Jogador 1-----------\n");
            return true;
        }
       else
            return false;
    }
}
