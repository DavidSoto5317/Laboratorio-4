// CC2006 Lab
// Este programa cliente prueba el comportamiento de su clase AlarmaEmergencia.

public class AlarmaMain {
	public static void main(String[] args) {
		Alarma alarmaIncendio = new Alarma();
                System.out.println(alarmaIncendio);   // emergencia Ring…Ring…Ring…Ring
		alarmaIncendio.m1();                  // emergencia 1
		alarmaIncendio.m2();                  // alarma 1 / timbre 1
		
	}
}