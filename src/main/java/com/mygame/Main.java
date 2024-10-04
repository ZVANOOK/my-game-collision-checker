package main.java.com.mygame;

// Основной класс приложения
public class Main {
    public static void main(String[] args) {
        Area area1 = new Area();
        Area area2 = new Area();

        GameObject player = new GameObject("Player");
        GameObject enemy = new GameObject("Enemy");

        // Инициализация объектов в области
        area1.addObject(player);
        area1.addObject(enemy);

        CollisionProcessor processor = new CollisionProcessor(area1, area2);

        // Перемещение игрока в другую область
        processor.process(player); // Объект "Player" перемещается в area2
        processor.process(enemy);   // Объект "Enemy" в той же области
    }
}
