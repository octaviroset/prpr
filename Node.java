/**
 * Base d'un node.
 */
public interface Node {
    /**
     * Activa el node.
     */
    void start();

    /**
     * Avança el procés del node
     * @return Estat del procés del node.
     */
    TaskStatus tick();

    /**
     * Retorna l'estat del node.
     * @return Estat del node.
     */
    TaskStatus getState();
}
