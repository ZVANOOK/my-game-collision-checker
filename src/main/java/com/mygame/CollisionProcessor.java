package main.java.com.mygame;

// Класс для обработки коллизий
class CollisionProcessor {
    private Area previousArea;
    private Area newArea;

    public CollisionProcessor(Area previous, Area newArea) {
        this.previousArea = previous;
        this.newArea = newArea;
    }

    public void process(GameObject movingObject) {
        if (movingObject.getCurrentArea() != newArea) {
            if (movingObject.getCurrentArea() != null) {
                movingObject.getCurrentArea().removeObject(movingObject);
            }
            newArea.addObject(movingObject);
            movingObject.setCurrentArea(newArea);
        }

        // Создаем команду проверки коллизий
        CollisionCommand command = new CheckCollisionCommand(newArea);

        // Пример аналогичной макрокоманды
        command.execute(movingObject);
    }
}
