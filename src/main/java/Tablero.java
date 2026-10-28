public class Tablero {
    private final Casilla[][] casillas = new Casilla[9][9];

    public Tablero(int[][] inicial){
        for (int fila=0; fila<9;fila++){
            for (int columna=0; columna<9; columna++){
                this.casillas[fila][columna] = new Casilla(inicial[fila][columna]);
            }
        }
    }
    public void mostrar(){
        for (int fila=0; fila<9;fila++){
            for (int columna=0; columna<9; columna++){
                Casilla c = casillas[fila][columna];
                System.out.print(c.getValor() + "|");
            }
            System.out.println();
        }
    }
    public boolean colocar(int fila, int columna, int valor){
        if (fila>=9 || fila<0 || columna>=9 || columna<0 || estaEnFila(fila,valor) || estaEnColumna(columna,valor)){
            System.out.println("Movimiento no válido.");
            return false;
        }
        Casilla c = casillas[fila][columna];
        return c.setValor(valor);
    }
    public boolean estaEnFila(int fila, int valor){
        for (int columna=0;columna<9;columna++){
            Casilla c = casillas[fila][columna];
            if (c.getValor() == valor){
                return true;
            }
        }
        return false;
    }
    public boolean estaEnColumna(int columna, int valor){
        for (int fila=0;fila<9;fila++){
            Casilla c = casillas[fila][columna];
            if (c.getValor() == valor){
                return true;
            }
        }
        return false;
    }
    public boolean estaEnCaja(int fila, int columna, int valor){
        int inicioFila = (fila/3)*3;
        int inicioColumna = (columna/3)*3;
        for (int finFila = inicioFila;finFila<inicioFila+3;finFila++){
            for (int finColumna = inicioColumna;finColumna<inicioColumna+3;finColumna++){
                Casilla c = casillas[finFila][finColumna];
                if (c.getValor() == valor){
                    return true;
                }
            }
        }
        return false;
    }
}
