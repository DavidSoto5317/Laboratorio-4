/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
//Esta clase sirve para modelar una alarma de emergencia
public class AlarmaEmergencia extends Alarma {
        /**
         * Imprime el mensaje 
         */
    public void m1() {
		System.out.println("emergencia 1"); //Imprime un mensaje
	}
        /**
         * Imprime el mensaje 
         */
    public void m2() {
		super.m1(); //Imprime un mensaje de la clase madre
                super.m2(); //Imprime un mensaje de la clase madre
	}
        /**
         * Imprime el mensaje 
         * @return Mensaje
         */
    public String toString() {
		return "emergencia " + super.toString(); //Imprime un mensaje de la calse madre con formato especifico
	}
}
