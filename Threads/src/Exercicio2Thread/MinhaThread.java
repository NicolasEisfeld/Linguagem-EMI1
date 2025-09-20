package Exercicio2Thread;

public class MinhaThread extends Thread {

    private String nome;
    private int temp;

    public MinhaThread(String nom, int temp) {
        this.nome = nom;
        this.temp = temp;
        Thread t = new Thread(this);

    }

    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " - Contador: " + i);
                Thread.sleep(temp);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " - FIM");
    }
    
    

}
