package JUGADOR;

import INTERFAZ.INTERFAZ;
import MAPA.Llanura;
import MAPA.Map;
import MAPA.tipoCasilla;

import java.awt.*;

public class PathFinding {


    public static boolean found = false;
    Jugador jugador;
    Map mapa;
    INTERFAZ interfaz;


    public PathFinding(Jugador jugador, Map mapa, INTERFAZ interfaz){
        this.jugador = jugador;
        this.mapa = mapa;
        this.interfaz = interfaz;
    }

    public boolean BuscarCaminoTest(Point lugar, Point destino){
        interfaz.PonerNumero(BuscarDistancia(destino, lugar), lugar);
        if (lugar.equals(destino))
            found = true;

        if (BuscarDistancia(lugar, destino) > BuscarDistancia(new Point (lugar.x - 1, lugar.y),destino) && mapa.mapa[lugar.x - 1][lugar.y] instanceof Llanura && !found){
            BuscarCaminoTest(new Point (lugar.x - 1, lugar.y),destino);
        }
        if (BuscarDistancia(lugar, destino) > BuscarDistancia(new Point (lugar.x + 1, lugar.y),destino) && mapa.mapa[lugar.x + 1][lugar.y] instanceof Llanura && !found){
            BuscarCaminoTest(new Point (lugar.x + 1, lugar.y),destino);
        }
        if (BuscarDistancia(lugar, destino) > BuscarDistancia(new Point (lugar.x, lugar.y - 1),destino ) && mapa.mapa[lugar.x][lugar.y - 1] instanceof Llanura && !found){
            BuscarCaminoTest(new Point (lugar.x , lugar.y - 1),destino);
        }
        if (BuscarDistancia(lugar, destino) > BuscarDistancia(new Point (lugar.x, lugar.y + 1),destino) && mapa.mapa[lugar.x][lugar.y + 1] instanceof Llanura && !found){
            BuscarCaminoTest(new Point (lugar.x , lugar.y + 1),destino);


        }

        return found;
    }


    public void Refound(Point lugar, Point destino){
        if (found)
            return;

        if (BuscarDistancia(lugar, destino) > BuscarDistancia(new Point (lugar.x - 1, lugar.y),destino) && mapa.mapa[lugar.x - 1][lugar.y] instanceof Llanura && !found)
            BuscarCaminoTest(new Point (lugar.x - 1, lugar.y),destino);

        if (BuscarDistancia(lugar, destino) > BuscarDistancia(new Point (lugar.x + 1, lugar.y),destino) && mapa.mapa[lugar.x + 1][lugar.y] instanceof Llanura && !found)
            BuscarCaminoTest(new Point (lugar.x + 1, lugar.y),destino);

        if (BuscarDistancia(lugar, destino) > BuscarDistancia(new Point (lugar.x, lugar.y - 1),destino ) && mapa.mapa[lugar.x][lugar.y - 1] instanceof Llanura && !found)
            BuscarCaminoTest(new Point (lugar.x , lugar.y - 1),destino);

        if (BuscarDistancia(lugar, destino) > BuscarDistancia(new Point (lugar.x, lugar.y + 1),destino) && mapa.mapa[lugar.x][lugar.y + 1] instanceof Llanura && !found)
            BuscarCaminoTest(new Point (lugar.x , lugar.y + 1),destino);



    }

    public int BuscarDistancia(Point destino){
        int distancia = 0;
        if (destino.x == jugador.posicion.x && destino.y == jugador.posicion.y)
            return 0;

        if (destino.x < jugador.posicion.x )
            distancia += jugador.posicion.x - destino.x;
        else
            distancia += destino.x - jugador.posicion.x;

        if (destino.y < jugador.posicion.y )
            distancia += jugador.posicion.y - destino.y;
        else
            distancia += destino.y - jugador.posicion.y;

        return distancia;
    }

    public int BuscarDistancia(Point punto, Point destino){
        int distancia = 0;
        if (destino.x == punto.x && destino.y == punto.y)
            return 0;

        if (destino.x < punto.x )
            distancia += punto.x - destino.x;
        else
            distancia += destino.x - punto.x;

        if (destino.y < punto.y )
            distancia += punto.y - destino.y;
        else
            distancia += destino.y - punto.y;

        return distancia;
    }

}
