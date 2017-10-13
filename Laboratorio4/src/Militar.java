/**
 * 
 * @author David
 */
// Una clase para representar a los militares en general.

public class Militar {
    /**
     * Regresara el numero de horas que trabaja un Militar
     * @return Horas que trabaja
     */
    public int getHoras() {
        return 40;           // trabaja 40 horas / semana
    }
    /**
     * Salario de un militar
     * @return Salario de un Militar
     */
    public double getSalario() {
        return 40000.0;      // Q40,000.00 / anio
    }
     /**
     * Dias de vacaciones de un general
     * @return Los dias de vacacionde de un General
     */
    public int getDiasVacaciones() {
        return 10;           // 2 semanas de vacaciones pagadas
    }
    /**
     * Muestra el color de formulario de un General
     * @return Color del formulario
     */
    public String getFormularioVacaciones() {
        return "amarillo";     // use el formulario amarillo
    }
}
