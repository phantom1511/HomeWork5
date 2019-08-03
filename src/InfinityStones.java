import java.util.ArrayList;
import java.util.Random;

public class InfinityStones {
    public static Avengers[] heroes = new Avengers[4];

    public Avengers[] returnHero() {//мы тут делаем метод из массива с помощью Hero[]
        heroes[0] = new Avengers("Iron Man", 250, 20, 1);
        heroes[1] = new Avengers("Captain America", 200, 30, 2);
        heroes[2] = new Avengers("Hulk", 300, 50, 2);
        heroes[3] = new Avengers("Thor", 350, 50, 3);

        return heroes;
    }
}
