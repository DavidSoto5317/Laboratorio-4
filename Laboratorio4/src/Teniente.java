/**
 * 
 * @author David
 */
// Una clase para representar a los Tenientes.

public class Teniente extends Militar {
    /**
     * Toma la orden de un coronel
     * @param texto Para responder a las ordenes
     */
    public void tomaOrdenCoronel(String texto) {
        System.out.println("Tomando orden del Coronel: " + texto);
    }
}
