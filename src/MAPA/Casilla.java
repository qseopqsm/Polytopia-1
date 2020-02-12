package MAPA;

public abstract class Casilla {
    boolean caminable;
    public int elevación;
    public boolean tesoro;
    public tipoCasilla tipo;

    public abstract void setTipo(tipoCasilla tipo);

    public abstract void setElevacion(int elevacion);

}

