import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Thanos thanos = new Thanos();
        thanos.setHealth(1200);
        thanos.setDamage(50);
        thanos.setDefence(50);

        System.out.println("............Thanos............");
        System.out.println("Thanos health: " + thanos.health);
        System.out.println("Thanos damage: " + thanos.damage);
        System.out.println("Thanos defence: " + thanos.defence);

        InfinityStones infinityStones = new InfinityStones();
        System.out.println("..................Avengers..................");
        System.out.println(Arrays.toString(infinityStones.returnHero()));
    }

}
