import java.util.ArrayList;

/**
 * Classe base per a totes les entitats.
 */
public abstract class Entity implements Comparable<Entity>{
    protected Species species;
    protected Board board;
    protected boolean alive;
    private ArrayList<Integer> priorities;

    /**
     * Actualitza l'entitat, permet fer el seguent pas.
     */
    public abstract void update();

    /**
     * Calcula les prioritats de les possibles accions
     * que pot prendre l'entitat depenent del seu entorn.
     */
    public abstract void calculatePriorities();

    /**
     * Les entitats es comparen segons la seva llista de prioritats.
     * @param o Entitat a comparar
     * @return Retorna 0 si les llistes son iguals, >0 si o es mes gran, i <0 si es mes petita.
     */
    @Override
    public int compareTo(Entity o) {
        for (int i = 0; i < priorities.size(); i++) {
            int value = Integer.compare(o.priorities.get(i), priorities.get(i));
            if (value != 0)
                return value;
        }
        return 0;
    }

    /**
     * Getter de l'especie de la entitat.
     * @return Species
     */
    public Species getSpecies() {
        return species;
    }
}
