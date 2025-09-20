package Exercicio2Thread;

public class Main {

    public static void main(String[] args) {
        MinhaThread mt1 = new MinhaThread("#1", 500);
        MinhaThread mt2 = new MinhaThread("#2", 1000);
        MinhaThread mt3 = new MinhaThread("#3", 700);

        mt1.start();
        mt2.start();
        mt3.start();
        
        // Modo 1
        /*while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive()){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        
        // Modo 2
        try {
            mt1.join();
            mt2.join();
            mt3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Programa Finalizado");

    }
}
