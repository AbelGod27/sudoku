public class Generador {
    private static boolean cabe(int[][] g, int fila, int columna, int valor){

            for (int col=0;col<9;col++){
                int c = g[fila][col];
                if (c==valor){
                    return false;
                }
            }
            for (int fil=0;fil<9;fil++){
                int c = g[fil][columna];
                if (c==valor){
                    return false;
                }
            }
            int inicioFila = (fila/3)*3;
            int inicioColumna = (columna/3)*3;
            for (int finFila = inicioFila;finFila<inicioFila+3;finFila++){
                for (int finColumna = inicioColumna;finColumna<inicioColumna+3;finColumna++){
                    int c = g[finFila][finColumna];
                    if (c==valor){
                        return false;
                    }
                }
            }
            return true;
    }


}
