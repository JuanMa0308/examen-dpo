package presentacion;

import examen1.Alfil;
import examen1.Casillas;
import examen1.Peon;
import examen1.Torre;

public class Principal {
	private Casillas casillas;
	public Principal() {
        casillas = new Casillas();
        probar();
    }
private void probar() {
	Peon peon = new Peon(2, 7);
    Torre torre = new Torre(3, 2);
    Alfil alfil = new Alfil(6, 1);
    System.out.println("Peon en (2,7) puede moverse a: " + peon.Movimientos(casillas) + " casillas.");
    System.out.println("Torre en (3,2) puede moverse a: " + torre.Movimientos(casillas) + " casillas.");
    System.out.println("Alfil en (6,1) puede moverse a: " + alfil.Movimientos(casillas) + " casillas.");

}
public static void main(String[] args) {
	new Principal();
	}

}
