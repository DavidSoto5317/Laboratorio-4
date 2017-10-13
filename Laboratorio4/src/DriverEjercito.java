/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
//Programa para demostrar el funcionamiento de la herencia
public class DriverEjercito {
    //Presenta lo que tiene y hace un soldado
    public static void main(String[] args) {
		Soldado miSoldado = new Soldado();
                System.out.println("Este en nuestro soldado Juan y esto es lo que realiza:");
		System.out.println("Nuestro soldado trabaja: "+miSoldado.getHoras()+" horas/semana");  // Horas que trabaja
		System.out.println("Nuestro recibe un sueldo de: Q."+miSoldado.getSalario()+" al anio");                 // Sueldo que recibe
                System.out.println("Nuestro soldado tiene : "+miSoldado.getDiasVacaciones()+" dias de vacaciones");   // Dias de vacaciones
                System.out.println("Nuestro soldado responde a la orden de esta manera: " );// Lo que dice al oir a su general
		miSoldado.recibeOrden();
	}
}
