import java.util.*;

public class Simula {
    Tile[][] grid = new Tile[10][10];

    List<Entity> entities = new ArrayList<>();
    //List<Entity> toAdd = new ArrayList<>();
    PriorityQueue<Entity> pq = new PriorityQueue<>(); // entitats ordenades per prioritat

    /*
    FUGIR - p + distancia * 10
    PERSEGUIR - p + distancia * 5
    ...
    ...
    ...
    MOURES ALEATORIAMENT - 0
     */

    void step_simple() {
        // Add new entities generated in previous step
        addEntities(toAdd);
        // Loop with iterator that permits remove()...
        ListIterator<Entity> iter = entities.listIterator();
        while (iter.hasNext()) {
            Entity entity = iter.next();
            if (!entity.isAlive())
                iter.remove();
            entity.update();
        }
    }

    void step() {
        for (Entity entity : entities) {
            entity.calculatePriorities(); // calcula les prioritats de les seguents possibles accions
            pq.offer(entity);
        }
        while (!pq.isEmpty())
            pq.poll().update();
    }
/*
    public void addEntity(Entity e) {
        Tile tile = grid[e.getX()][e.getY()];
        if (tile.addEntity(e))
            entities.add(e);
    }

    private void removeEntity(Entity e) {
        Tile tile = grid[e.getX()][e.getY()];
        tile.removeEntity(e);
        entities.remove(e);
        pq.remove(e);
    }

    private void addEntities(List<Entity> toAdd) {
        for (Entity e : toAdd) {
            Tile tile = grid[e.getX()][e.getY()];
            if (tile.addEntity(e))
                entities.add(e);
        }
    }*/
}
