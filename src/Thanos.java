import java.util.Random;

public class Thanos {
    int health;
    int damage;
    int defence;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence * changeBossDefence();
    }

    public static int changeBossDefence() {
        Random random = new Random();
        int randomNum = random.nextInt(3) +1;
       return randomNum;

    }

}
