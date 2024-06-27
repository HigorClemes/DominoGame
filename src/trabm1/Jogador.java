package trabm1;

import java.util.ArrayList;
import java.util.Random;

public class Jogador {
    
    Random gerador = new Random();
    
    
    private ArrayList<peca> a = new ArrayList<>();
    private int numPeca;
    
    public void RemoverPeca(int valor){
        if (a.isEmpty() == false) {
            a.remove(valor);
        }
    } 
    
    public peca pegarPeca(int n){
        if (a.isEmpty() == false) 
         return a.get(n);
        else
         return null;
    }
    public void adicionarPeca (peca n){
        a.add(n);
    }
    
    public ArrayList<peca> getJogador() {
        return a;
    }
    
    public Jogador(domino d) {
        peca pc;
    
        for (int i = 0; i < 7; i++){
        numPeca = gerador.nextInt(d.QtdePecas());    
        pc = new peca(d.getPecas().get(numPeca).lado1, d.getPecas().get(numPeca).lado2);
            a.add(pc); 
            d.RemoverPeca(numPeca);
        }
        
    }
   
    public void pecasJogador (String nome){
        System.out.println("\nPedras " +nome);
        for(int i = 0; i < a.size(); i++ ){     
            System.out.println(nome+", Peça "+(i+1)+": [" +a.get(i).lado1 +"|"+a.get(i).lado2+ "]");
        }
        System.out.println("\n");
    }
    
     public void pecasJogador (String nome, int b){ 
        System.out.println("\t"+nome+", Jogou a peça: [" +a.get(b).lado1 +"|"+a.get(b).lado2+ "]\n");
    }
    
}
