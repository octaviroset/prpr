import java.util.Collection;

/**
 * Classe base pels animals.
 */
public abstract class Animal extends Entity {
    //protected int health;
    //protected int maxHealth;
    //protected int visionRange;
    //protected int hunger;
    //protected int maxHunger;
    protected Behaviour behaviour;

    /**
     * Colleccio d'especies enemiguies.
     */
    protected Collection<Species> enemies;
    /**
     * Colleccio d'especies consumibles
     */
    protected Collection<Species> consumables;

    /**
     * L'animal reb mal.
     * @param amount Quantitat de mal rebut.
     */
    public abstract void recieveDamage(int amount);
}
