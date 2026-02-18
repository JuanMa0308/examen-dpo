package examen1;

public class Casillas {
	public static final int tamanio = 8;
	
	public boolean Validez(int fila, int columna) {
		return fila >= 1 && tamanio >= fila && columna >= 1 && tamanio >= columna;
	}
			
}
