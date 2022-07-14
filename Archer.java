public class Archer extends PlayerCharacter {
    private int numberOfArrows;

    public Archer(String name, int age, int numberOfArrows) {
        super(name, age);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
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
}
