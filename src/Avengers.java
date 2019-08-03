import java.awt.*;

public class Avengers {
    String name;
    int health;
    int damage;
    int superpower;

    public Avengers(String name, int health, int damage, int superpower) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public String toString() {
        return name + " health: " + health + " damage: " + damage + " superpower: " + superpower + "\n";
    }
}
