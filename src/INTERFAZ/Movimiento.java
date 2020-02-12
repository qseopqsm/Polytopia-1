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
        for (int i = click.x - 2; i < 5 ; i++) {
            for (int j = click.y - 2; j < 5 ; j++) {
                if (mapa.mapa[i][j] instanceof Llanura){
                    interfaz.label[i][j].setBackground(new Color(0,0,255));
                }

            }
        }
    }


}
