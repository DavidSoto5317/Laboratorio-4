/**
 * 
 * @author David
 */
// Una clase para representar a los Generales.

public class General extends Militar {
    /**
     * Dias de vacaciones de un general
     * @return Los dias de vacacionde de un General
     */
    public int getDiasVacaciones() {
        return super.getDiasVacaciones() + 5;           // 3 semanas de vacaciones
    }
    /**
     * Muestra el color de formulario de un General
     * @return El color del formulario
     */
    public String getFormularioVacaciones() {
        return "rosado";
    }
    /**
     * Muestra la Estrategia de un General
     */
    public void planificaEstrategia() {
        System.out.println("Llevaremos tres divisiones a la frontera!");
    }
}
