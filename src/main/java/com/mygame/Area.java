package main.java.com.mygame;
import java.util.ArrayList;
import java.util.List;

// Окрестность (Area)
class Area {
    private List<GameObject> gameObjects = new ArrayList<>();

    public void addObject(GameObject object) {
        gameObjects.add(object);
        System.out.println(object.getName() + " добавлен в область.");
    }

    public void removeObject(GameObject object) {
        gameObjects.remove(object);
        System.out.println(object.getName() + " удален из области.");
    }

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
