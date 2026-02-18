package examen1;

public class Peon extends Ficha {
	
	public Peon( int fila, int columna) {
		super(fila, columna);
	}

	@Override
	public int Movimientos(Casillas casillas) {
		int movimientos = 0;
		if (casillas.Validez(fila + 1, columna)) {
            movimientos++;
	}
		if (fila == 2 && casillas.Validez(fila + 2, columna)) {
            movimientos++;
        }

        return movimientos;
    }
}
