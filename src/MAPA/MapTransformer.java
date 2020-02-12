package MAPA;

public class MapTransformer {
    private MapGenerator mg;
    public MapTransformer(MapGenerator mg){
        this.mg = mg;
    }


    public Casilla[][] Transform(){
        int[][] mapa = this.mg.getMapa();
        Casilla[][] map = new Casilla[mapa.length][mapa[0].length];
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length ; j++) {
                switch (mapa[i][j]){
                    case -1:
                    case 0:
                        map[i][j] = new Mar();
                        map[i][j].setTipo(tipoCasilla.MAR);
                        break;
                    case 1:
                        map[i][j] = new Llanura();
                        map[i][j].setElevacion((int)(Math.random()*2));
                        break;
                    case 2:
                        map[i][j] = new Llanura();
                        map[i][j].setElevacion((int)(Math.random()*2) + 1);
                        break;
                    case 3:
                        map[i][j] = new Monte();
                        map[i][j].setTipo(tipoCasilla.MONTE);
                        break;
                    case 4:
                        map[i][j] = new Bosque();
                        map[i][j].setTipo(tipoCasilla.BOSQUE);
                        break;
                    case 5:
                        map[i][j] = new Rio();
                        map[i][j].setTipo(tipoCasilla.RIO);
                        break;
                    default:
                        System.out.println("Smth went wrong");
                        break;

                }
            }
        }
        return map;
    }
}
