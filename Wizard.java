public class Wizard extends PlayerCharacter  {
    private int power;
    private int level;

    public Wizard(String name, int age, int currentLevel, int power) {
        super(name, age, currentLevel);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void attack() {
        System.out.println("Attacking power: " + power);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "power=" + power +
                '}';
    }

    @Override
    public void levelUp() {
        int level = getCurrentLevel() + 1;
        setCurrentLevel(level);
        power+=50;
    }
}
