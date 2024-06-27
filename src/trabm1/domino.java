package trabm1;
 
import java.util.Random;
import java.util.ArrayList;

public class domino {
    Random gerador = new Random();
    
    private ArrayList <peca> p = new ArrayList();
    
    public ArrayList<peca> getPecas(){
        return p;
    }
    
    public void criaPecas (){
       for (int i=0; i<=6; i++){
           for (int j=i; j<=6; j++){
               peca d = new peca(i,j);
               p.add(d);     
           }
       }
   }
    public peca pegarPecaMesa(int n){
        if (p.isEmpty() == false) {
            return p.get(n);
        }
        return null;
    }
    public void mostrarPecas(){
        if (p.isEmpty() == false) {
            System.out.println("Peças da mesa:");
        }
        int n = p.size();
        for (int i=0; i<n; i++){
            System.out.println("Peça "+ (i+1) +": " + p.get(i));
        }
    }
    
    public int QtdePecas(){
        int tamanho = p.size();
        return tamanho;
    } 
   
    public void RemoverPeca(int valor){
        p.remove(valor);
    } 
    
    public ArrayList<peca> PecaMesa(){
        return p;
    }
    
}
