package main.java.com.mygame;

// Команда проверки коллизии для одной области
class CheckCollisionCommand extends CollisionCommand {
    private Area area;

    public CheckCollisionCommand(Area area) {
        this.area = area;
    }

    @Override
    public void execute(GameObject movingObject) {
        System.out.println("Проверка коллизий для объекта: " + movingObject.getName());
        for (GameObject object : area.getGameObjects()) {
            if (movingObject.checkCollision(object)) {
                System.out.println(movingObject.getName() + " сталкивается с " + object.getName());
            }
        }
        if (next != null) {
            next.execute(movingObject);
        }
    }
}
