package examen1;

public class Torre extends Ficha {
	public Torre (int fila, int columna) {
		super(fila, columna);
	}

	@Override
	public int Movimientos(Casillas casillas) {
		// TODO Auto-generated method stub
		int movimientos = 0;
		movimientos += Casillas.tamanio - fila;
		movimientos += fila - 1;
		movimientos += Casillas.tamanio - columna;
		movimientos += columna - 1;
		return movimientos;
	}
}
