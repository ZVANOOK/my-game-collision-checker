package main.java.com.mygame;
import java.util.ArrayList;
import java.util.List;

// Окрестность (Area)
class Area {
    private List<GameObject> gameObjects = new ArrayList<>();

    public void addObject(GameObject object) {
        gameObjects.add(object);
    }

    public void removeObject(GameObject object) {
        gameObjects.remove(object);
    }

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
