public static void main(String[] args) {
    int fila,columna,valor;
    Scanner sc = new Scanner(System.in);
    Tablero tablero = new Tablero(Generador.generar(dificultad(sc).getHuecos()));
    tablero.mostrar();
    while (!tablero.estaCompleto()){
        System.out.print("Dame la fila: ");
        fila = sc.nextInt();

        System.out.print("Dame la columna: ");
        columna = sc.nextInt();

        System.out.print("Dame la valor: ");
        valor = sc.nextInt();

        tablero.colocar(fila,columna,valor);

        tablero.mostrar();
    }
}

private static Dificultad dificultad(Scanner sc){
    System.out.println("DIFICULTAD");
    System.out.println("1. Fácil");
    System.out.println("2. Medio");
    System.out.println("3. Difícil");
    System.out.print("Dime la dificultad que eliges: ");
    int opcion = sc.nextInt();
    Dificultad d = switch(opcion){
        case 1 -> Dificultad.facil;
        case 2 -> Dificultad.medio;
        case 3 -> Dificultad.dificil;
        default -> Dificultad.medio;
    };
    return d;
}
