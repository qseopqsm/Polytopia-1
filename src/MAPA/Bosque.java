package MAPA;

public class Bosque extends ResourcesCasilla {


    @Override
    public void setTipo(tipoCasilla tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setElevacion(int elevacion){
        this.elevación = elevacion;
    }
}
