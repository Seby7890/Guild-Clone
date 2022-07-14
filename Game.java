public class Game {
    public static void main(String[] args) {
        PlayerCharacter player1 = new PlayerCharacter("Sebi", 32) {
            @Override
            public void attack() {

            }
        };
        player1.speak();
        System.out.println(player1.getName());
        System.out.println(player1.getAge());
        player1.setName("Oli");
        player1.setAge(27);
        System.out.println(player1.getName());
        System.out.println(player1.getAge());

        Archer Arrow = new Archer("Mitza", 31, 50);
        Arrow.speak();

        Wizard Merlin = new Wizard("Ady", 31, 1000);
        Merlin.speak();

        Arrow.attack();
        Merlin.attack();

        playerAttack(Arrow);
        playerAttack(Merlin);

        System.out.println(Arrow.toString());
        System.out.println(Merlin.toString());
    }

    public static void playerAttack(PlayerCharacter playerCharacter) {
        playerCharacter.attack();
    }

}