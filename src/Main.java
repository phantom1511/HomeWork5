public class Main {

    public static void main(String[] args) {
        Thanos thanos = new Thanos();
        thanos.setDefence(300);
        System.out.println(thanos.defence);

        MagicDoor magicDoor = new MagicDoor();
        for (int i = 0; i < 4; i++) {
            System.out.println(magicDoor.heroes[i]);
        }
    }

}
