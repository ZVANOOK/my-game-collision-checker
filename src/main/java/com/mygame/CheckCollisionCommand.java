package main.java.com.mygame;

// Команда проверки коллизии для одной области
class CheckCollisionCommand extends CollisionCommand {
    private final Area area;

    public CheckCollisionCommand(Area area) {
        this.area = area;
    }

    @Override
    public void execute(GameObject movingObject) {
        for (GameObject object : area.getGameObjects()) {
            if (movingObject.checkCollision(object)) {
                System.out.println(movingObject.getName() + " collides with " + object.getName());
            }
        }
        if (next != null) {
            next.execute(movingObject);
        }
    }
}
