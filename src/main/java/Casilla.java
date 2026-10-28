public class Casilla {
    private int valor;
    private final boolean esFija;
    //Creacion del constructor
    public Casilla(int valor){
        this.valor = valor;
        esFija = valor > 0;
    }

    public int getValor() {
        return valor;
    }

    public boolean setValor(int nuevo) {
        if (esFija){
            return false;
        }else {
            this.valor = nuevo;
            return true;
        }
    }
}
