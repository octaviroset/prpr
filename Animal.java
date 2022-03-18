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

    protected Collection<Entity> enemies;
    protected Collection<Entity> food;

    abstract void recieveDamage();
}
