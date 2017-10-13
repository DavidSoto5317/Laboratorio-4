/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
// Una clase para representar a Soldados
public class Soldado extends Militar{
    /**
     * Regresara el numero de horas que trabaja un soldado
     * @return Horas que trabaja
     */
    public int getHoras(){
        return super.getHoras()*2; // 80 horas / semana
    }
    /**
     * Regresa el salario que tendra un soldado
     * @return Salario de soldado
     */
    public double getSalario() {
        return super.getSalario()-10000.0;      // Q30,000.00 / anio
    }
    /**
     * Regresa los dias de vacacione de un soldado
     * @return Los dias de vaciones del soldado
     */
    public int getDiasVacaciones() {
        return super.getDiasVacaciones()-5;           // 5 dias de vacaciones
    }
    /**
     * imprime el mensaje que de recepcion de Ordenes
     */
    public void recibeOrden(){
        System.out.println("Ordene mi general");
    }
}
