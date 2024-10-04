package main.java.com.mygame;

// Игровой объект
class GameObject {
    private String name;
    private Area currentArea;

    public GameObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Area getCurrentArea() {
        return currentArea;
    }

    public void setCurrentArea(Area currentArea) {
        this.currentArea = currentArea;
    }

    // Метод для определения коллизии с другим объектом (подразумевается)
    public boolean checkCollision(GameObject other) {
        // Здесь должна быть реализация проверки коллизии
        return CollisionDetector.checkCollision(this, other);
    }
}
