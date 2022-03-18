import javafx.scene.layout.StackPane;
import java.util.Collection;

/**
 * Tauler que conte un conjunt d'entitats
 */
public class Board extends StackPane {
    /**
     * Afegeix una entitat al tauler.
     * @param entity
     */
    public void addEntity(Entity entity){

    }

    /**
     * Esborra una entitat del tauler.
     * @param entity
     */
    public void removeEntity(Entity entity){

    }

    /**
     * Busca entitats a les caselles del voltant amb rang 1..n i retorna les trobades.
     * @param entities
     * @return Entities found
     */
    public Collection<Entity> entitiesInRange(Entity... entities){
        return null;
    }

}
