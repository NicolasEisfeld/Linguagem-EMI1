
package exercicio7;

/*
    Exercício Referente a Segunda Avaliação de Linguagem de Programação I
*/



public class main_contador {
    public static void main(String [] args) {
        Contador c1 = new Contador("A", 8);
        Contador c2 = new Contador("B", 6);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
