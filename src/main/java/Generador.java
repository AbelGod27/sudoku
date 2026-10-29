import java.util.*;

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

            for (int finFila = (fila/3)*3;finFila<(fila/3)*3+3;finFila++){
                for (int finColumna = (columna/3)*3;finColumna<(columna/3)*3+3;finColumna++){
                    int c = g[finFila][finColumna];
                    if (c==valor){
                        return false;
                    }
                }
            }
            return true;
    }
    private static boolean llenar(int[][] g) {
        for (int f = 0; f < 9; f++) {
            for (int c = 0; c < 9; c++) {
                if (g[f][c] == 0) {
                    List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
                    Collections.shuffle(numeros);//Shuffle ordena de forma aleatoria a la colección

                    for (int n : numeros) {
                        if (cabe(g,f,c,n)){
                            g[f][c] = n;
                            if (llenar(g)){
                                return true;
                            } else {
                                g[f][c] = 0;
                            }
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] generar() {
        int[][] g = new int[9][9];
        llenar(g);

        Random r = new Random();
        int quitadas = 0;
        while (quitadas < 45) {
            int fila = r.nextInt(9);
            int columna = r.nextInt(9);
            if (g[fila][columna]!=0){
                g[fila][columna]=0;
                quitadas++;
            }
        }
        return g;
    }
}
