public class Game {
    public static void main(String[] args) {
        Archer arrow = new Archer("Mitza", 31, 1, 50);
        arrow.speak();

        Wizard merlin = new Wizard("Ady", 31, 1, 5);
        merlin.speak();

        arrow.attack();
        merlin.attack();

        playerAttack(arrow);
        playerAttack(merlin);

        arrow.levelUp();
        merlin.levelUp();

        System.out.println("Current level of arrow is: " + arrow.getCurrentLevel());
        System.out.println("Current number of arrows is: " + arrow.getNumberOfArrows());
        System.out.println("Current level of merlin is: " + merlin.getCurrentLevel());
        System.out.println("Current power is: " + merlin.getPower());
    }

    public static void playerAttack(PlayerCharacter playerCharacter) {
        playerCharacter.attack();
    }

}