public class Hero {
    int health;
    int damage;
    int superpower;

    public Hero(int health, int damage, int superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public String toString() {
        return " health: " + health + " damage: " + damage + " superpower: " + superpower + "\n";
    }
}
