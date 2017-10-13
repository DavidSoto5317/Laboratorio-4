/**
 * 
 * @author David
 */
public class Alarma extends Timbre {
        /**
         * Imprime el mensaje 
         */
	public void m1() {
		System.out.println("alarma 1"); //Imprime un mensaje
	}
        
        /**
         * Imprime el mensaje 
         */	 
	public void m2() {
		super.m1(); //Imprime un mensaje de la clase madre
	}
        /**
         * Imprime el mensaje 
         * @return Mensaje
         */	 
	public String toString() {
		return super.toString() + "…" + super.toString(); //Imprime un mensaje de la clase madre con un formato especifico
	}
}
