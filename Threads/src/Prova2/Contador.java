
package exercicio7;

public class Contador implements  Runnable  {
    private String nome;
    private int vezes;

    public Contador(String nome, int vezes) {
        this.nome = nome;
        this.vezes = vezes;
    }
    
    @Override
    public void run(){
        for(int i = 1; i<=vezes; i++) {
            System.out.println("Thread "+ nome +" : " + i);
            
        }
    }
}
