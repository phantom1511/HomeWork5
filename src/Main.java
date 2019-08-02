import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Thanos thanos = new Thanos();
        thanos.setDefence(300);
        System.out.println(thanos.defence);

        MagicDoor magicDoor = new MagicDoor();

        System.out.println(Arrays.toString(magicDoor.returnHero()));

    }

}
