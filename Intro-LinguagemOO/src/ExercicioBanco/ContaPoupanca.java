// ExercicioBanco/ContaPoupanca.java
package ExercicioBanco;

public class ContaPoupanca extends Conta {

    private double taxa;

    public ContaPoupanca(int numero, String dono, double saldo) {
        super(numero, dono, saldo);
        this.taxa = 0; // Inicializa a taxa como 0
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa; // Define a taxa
    }

    public void Sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }
}