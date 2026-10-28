
void main() {
    int[][] inicial = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
    };
    Tablero tablero = new Tablero(inicial);
    int fila, columna, valor;
    Scanner sc = new Scanner(System.in);
    tablero.mostrar();

    while (true){
        System.out.println("Dame la fila");
        fila = sc.nextInt();

        System.out.println("Dame la columna");
        columna = sc.nextInt();

        System.out.println("Dame la valor");
        valor = sc.nextInt();

        tablero.colocar(fila,columna,valor);

        tablero.mostrar();
    }
}
