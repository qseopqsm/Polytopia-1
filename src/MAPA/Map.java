package MAPA;

public class Map {
    public Casilla[][] mapa;


    public Map(MapTransformer mt){
        this.mapa = mt.Transform();
    }
}
