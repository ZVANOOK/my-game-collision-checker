package main.java.com.mygame;

// Команда проверки коллизии
abstract class CollisionCommand {
    protected CollisionCommand next;

    public void setNext(CollisionCommand next) {
        this.next = next;
    }

    public abstract void execute(GameObject object);
}
