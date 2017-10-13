/**
 * 
 * @author David
 */
// Una clase para representar a los Coroneles.

public class Coronel extends Teniente {
    /**
     * Salario de un Coronel
     * @return Salario de un Coronel
     */
    public double getSalario() {
        return super.getSalario() + 5000.0;      // Q45,000.00 / anio
    }
    /**
     * Ejecuta la maniobra de un Coronel
     */
    public void ejecutaOrdenManiobra() {
        System.out.println("Presenten Armas!");
    }
}
