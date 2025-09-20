
package Tributos;

public class GerenciadorDeImpostoRenda{
    private double totalTributos;

    public void adicionarTributos(Tributavel T) { // Com a Interface, unifica os impostas respectivos das classes para uma só.
        double tributo = T.calculaTributos();
        totalTributos += tributo;
    }
    
    public double getTributo() {
        return totalTributos;
    }
    

}
