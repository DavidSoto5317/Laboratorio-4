// CC2006 Lab
// Este programa cliente prueba el comportamiento de su clase AlarmaEmergencia.

public class AlarmaMain {
    //Aqui comienza el programa
	public static void main(String[] args) {
		AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
		alarmaIncendio.m1();                  // emergencia
		alarmaIncendio.m2();                  // alarma 1 / timbre 1
                System.out.println(alarmaIncendio);   // emergencia Ring…Ring…Ring…Ring
		
	}
}