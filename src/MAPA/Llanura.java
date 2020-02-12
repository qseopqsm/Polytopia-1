package MAPA;

public class Llanura extends Casilla {



    @Override
    public void setTipo(tipoCasilla tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setElevacion(int elevacion){
        switch (elevacion){
            case 0: setTipo(tipoCasilla.LLANURA1);break;
            case 1: setTipo(tipoCasilla.LLANURA2);break;
            case 2: setTipo(tipoCasilla.LLANURA3);break;
        }
        this.elevación = elevacion;
    }
}
