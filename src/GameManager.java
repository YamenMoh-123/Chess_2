import java.awt.Color;
import java.awt.Graphics2D;
import java.util.LinkedList;

public class GameManager {

    LinkedList<PieceObject> gameObjects = new LinkedList<PieceObject>();

    public void tick() {
        gameObjects.forEach(gameObject -> gameObject.tick());
    }

    public void render(Graphics2D g2d) {
        g2d.translate(0, 0);
        System.out.println("Rendering" + gameObjects.size());
        gameObjects.forEach(gameObject -> gameObject.render(g2d));
    }

    public void addGameObject(PieceObject gameObject) {
        System.out.println("Adding the Queen");
        gameObjects.add(gameObject);
    }

    public void removeGameObject(PieceObject gameObject) {
        gameObjects.remove(gameObject);
    }
}
