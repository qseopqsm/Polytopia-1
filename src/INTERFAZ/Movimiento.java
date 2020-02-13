package INTERFAZ;

import JUGADOR.Jugador;
import JUGADOR.PathFinding;
import MAPA.Llanura;
import MAPA.Map;

import java.awt.*;

public class Movimiento {
    Map mapa;
    Jugador jugador;
    INTERFAZ interfaz;
    Movimiento(INTERFAZ interfaz, Map mapa, Jugador jugador){
        this.interfaz = interfaz;
        this.mapa = mapa;
        this.jugador = jugador;
    }
    public void MovimientoTropaTest01(INTERFAZ interfaz, Map mapa, PathFinding pathfinding, Point click){

        for (int i = click.x - 3; i <= click.x + 3 ; i++) {
            for (int j = click.y - 3; j <= click.y + 3 ; j++) {
                if (pathfinding.BuscarDistancia(new Point(i,j)) < 4)
                if (i >= 0 && i < mapa.mapa.length - 1 && j >= 0 && j < mapa.mapa[0].length - 1)
                if (i != click.x || j != click.y)
                if (mapa.mapa[i][j] instanceof Llanura){
                    interfaz.CambiarColor(new Point(i,j), new Color(50,50,255));
                }
            }
        }
    }


}
