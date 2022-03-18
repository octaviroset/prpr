/**
 * Node pare amb multiples fills.
 */
public interface Composite extends Node {
    /**
     * Afegeix un fill al node.
     * @param child
     */
    void addChild(Node child);

    /**
     * Setter dels fills del node.
     * @param children
     */
    void setChildren(Node... children);
}
