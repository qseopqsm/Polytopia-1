package INTERFAZ;

import JUGADOR.Jugador;
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
    public void MovimientoTropaTest01(INTERFAZ interfaz, Map mapa, Jugador jugador, Point click){
        System.out.println("Hello");
        for (int i = click.x - 2; i <= click.x + 2 ; i++) {
            for (int j = click.y - 2; j <= click.y + 2 ; j++) {
                if (i != click.x || j != click.y)
                if (mapa.mapa[i][j] instanceof Llanura){
                    interfaz.CambiarColor(new Point(i,j), new Color(50,50,255));
                }

            }
        }
    }


}
