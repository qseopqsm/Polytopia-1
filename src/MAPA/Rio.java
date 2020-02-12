package MAPA;

public class Rio extends Agua {
    @Override
    public void setTipo(tipoCasilla tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setElevacion(int elevacion){
        this.elevación = elevacion;
    }
}
