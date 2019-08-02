import java.util.ArrayList;

public class MagicDoor {
    public static Hero[] heroes = new Hero[4];

    //ArrayList<Hero> heroes = new ArrayList<>();
    public Hero[] returnHero() {
        heroes[0] = new Hero(200, 20, 1);
        heroes[1] = new Hero(250, 20, 1);
        heroes[2] = new Hero(150, 20, 1);
        heroes[3] = new Hero(150, 20, 1);
        /* Hero hulk = new Hero(300,20,1);
        Hero ironMan = new Hero(300,20,1);
        Hero capitanAmerica = new Hero(250,20,1);
        Hero thor = new Hero(300,50,1);*/
        return heroes;
    }
}
