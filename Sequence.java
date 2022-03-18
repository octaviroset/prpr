/**
 * Node pare que executa fills fins que un falla.
 */
public class Sequence implements Composite {
    public void start() {}
    public TaskStatus tick() {return null;}
    public TaskStatus getState() {return null;}

    public void addChild(Node child) {}
    public void setChildren(Node... children) {}
}
