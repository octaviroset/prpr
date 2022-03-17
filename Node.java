public interface Node {
    void start();
    TaskStatus tick();
    TaskStatus getState();
}
