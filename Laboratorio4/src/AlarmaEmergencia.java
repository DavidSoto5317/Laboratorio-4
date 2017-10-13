/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class AlarmaEmergencia extends Alarma {
    public void m1() {
		System.out.println("emergencia 1");
	}
    public void m2() {
		super.m1();
                super.m2();
	}
    public String toString() {
		return "emergencia " + super.toString();
	}
}
