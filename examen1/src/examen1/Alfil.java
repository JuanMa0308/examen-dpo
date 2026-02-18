package examen1;

public class Alfil extends Ficha {
	public Alfil(int fila, int columna) {
        super(fila, columna);
    }

	@Override
	public int Movimientos(Casillas casillas) {
		// TODO Auto-generated method stub
		int movimientos = 0;
        movimientos += Math.min(Casillas.tamanio - fila, Casillas.tamanio - columna);
        movimientos += Math.min(Casillas.tamanio - fila, columna - 1);
        movimientos += Math.min(fila - 1, Casillas.tamanio - columna);
        movimientos += Math.min(fila - 1,  columna - 1);
        return movimientos;
    }
	
}
