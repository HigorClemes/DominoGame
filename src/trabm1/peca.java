package trabm1;

public class peca {
    int lado1;
    int lado2;
    
    public peca (int a, int b){
        lado1 = a;
        lado2 = b;
        
    }
    public void setLado1(int ladoA){
        lado1 = ladoA;
    }
    
    public int getLado1(){
        return lado1;
    } 
    
    public void setLado2 (int ladoB){
        lado2 = ladoB;
    }
    
    public int getLado2(){
        return lado2;
    }
    
    @Override
    public String toString (){
        String result;
        
        result = String.format ("[%d|%d]", lado1, lado2);
        
        return (result);
    }
    
}
