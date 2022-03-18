import java.util.Collection;

/**
 * Descripció general: porciò quadrada a dins del board.
 */
public class Tile {

    /**
     * Retorna la posicio horitzontal de la casella.
     * @return
     */
    public int getY() {return 0;}

    /**
     * Retorna la posicio vertical de la casella.
     * @return
     */
    public int getX() {return 0;}
    /**
     * Afegeix una entitat a la casella.
     * @param entity
     * @return True si ha pogut afegir l'entitat.
     */
    public boolean addEntity(Entity entity) {return true;}

    /**
     * Esborra una entitat del tauler.
     * @param entity
     */
    public void removeEntity(Entity entity){}

    /**
     * Comprova si hi ha una/es entitats dins la casella.
     * @param s
     * @return True si hi ha alguna entitat present.
     */
    public boolean containsEntities(Species... s) {return false;} //Comprovar si hi ha diferents entitats a la casella.

    /**
     * Comprova si hi ha una/es entitats dins la casella.
     * @param s
     * @return Les entitats trobades.
     */
    public Collection<Entity> checkForEntities(Species... s) {return null;}

}
