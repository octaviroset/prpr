
public abstract class Entity {
    protected Board board;
    protected boolean alive;
    // protected void setPosition(Position p) {}
    public abstract void update();
    public Board getBoard() {return board;}
    public boolean isAlive() {return alive;}
    public void setBoard(Board board) {this.board = board;}
}
