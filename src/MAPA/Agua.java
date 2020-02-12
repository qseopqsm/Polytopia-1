package MAPA;

public abstract class Agua extends Casilla{




    @Override
    public void setTipo(tipoCasilla tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setElevacion(int elevacion){
        this.elevación = elevacion;
    }
}
