/**
 * Node pare amb només un fill.
 */
public interface Decorator extends Node {
    /**
     * Setter del fill del node.
     * @param child
     */
    void setChild(Node child);
}
