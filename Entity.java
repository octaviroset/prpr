import java.util.List;

/**
 * Classe base per a totes les entitats.
 */
public abstract class Entity implements Comparable<Entity>{
    List<Integer> l;

    protected Board board;
    protected boolean alive;
    private int x;
    private int y;
    // protected void setPosition(Position p) {}
    public abstract void update();
    //public Board getBoard() {return board;}
    public boolean isAlive() {return alive;}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    private List<Integer> priorities;
    public abstract void calculatePriorities();
    //public void setBoard(Board board) {this.board = board;}


    @Override
    public int compareTo(Entity o) {
        return l.compareTo(o.l);
    }
}
