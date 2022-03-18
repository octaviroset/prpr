/**
 * Node pare amb multiples fills.
 */
public interface Composite extends Node {
    void addChild(Node child);
    void setChildren(Node... children);
}
