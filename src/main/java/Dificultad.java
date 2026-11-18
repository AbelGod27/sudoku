public enum Dificultad {
    facil(30), medio(45), dificil(55);
    private final int huecos;

    Dificultad(int huecos) {
        this.huecos = huecos;
    }

    public int getHuecos(){
        return huecos;
    }
}