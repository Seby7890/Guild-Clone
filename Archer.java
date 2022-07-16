public class Archer extends PlayerCharacter  {
    private int numberOfArrows;
    private int level;

    public Archer(String name, int age, int currentLevel, int numberOfArrows) {
        super(name, age, currentLevel);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void attack() {
        numberOfArrows--;
        System.out.println("Number of arrows left: " + numberOfArrows);
    }

    @Override
    public String toString() {
        return "Archer{" +
                "numberOfArrows=" + numberOfArrows +
                '}';
    }

    @Override
    public void levelUp() {
        int level = getCurrentLevel() + 1;
        setCurrentLevel(level);
        numberOfArrows+=100;
    }
}
