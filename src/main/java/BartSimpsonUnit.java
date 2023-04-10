public class BartSimpsonUnit extends Unit {
    private int numTimesSpawned;
    private boolean distract;
    private boolean recruit;
    private final int MAX_NUM_SPAWNED = 1;

    public BartSimpsonUnit(char symbol, String name, double health, double healthModifier, double damage,
                           double damageModifier, int luck, int xCor, int yCor, int movement,
                           int movementModifier, int numTimesSpawned, boolean distract, boolean recruit, String teamColor) {
        super(symbol, name, health, healthModifier, damage, damageModifier, luck, xCor, yCor, movement, movementModifier, teamColor);
        this.numTimesSpawned = numTimesSpawned;
        this.distract = distract;
        this.recruit = recruit;

    }
    public BartSimpsonUnit() {
        this('B', "Bart Simpson", 100.0, 0.0, 25.0, 0.0, 0, 5, 5, 1, 0, 0, true, true, "none");
    }
    public int getNumTimesSpawned(){
        return this.numTimesSpawned;
    }
    public boolean canDistract(){
        return this.distract;
    }
    public boolean canRecruit(){
        return this.recruit;
    }
    public boolean canSpawn(){
        if ((this.getNumTimesSpawned() < MAX_NUM_SPAWNED) && this.getSymbol() == 'B') {
            return true;
        }
        else {
            return false;
        }
    }

    public void setNumTimesSpawned(int numTimesSpawned) {
        this.numTimesSpawned = numTimesSpawned;
    }
    public void setDistract(boolean distract) {
        this.distract = distract;
    }
    public void setRecruit(boolean recruit) {
        this.recruit = recruit;
    }
    public void distracted() {
        if (this.canDistract()) {
            System.out.println("Unit Distracted!");
        }
    }
    public BartSimpsonUnit spawn() {
        BartSimpsonUnit newBart = new BartSimpsonUnit('b', "Bart Simpson", 100.0,
                5.0, 25.0, 10.0, 0, 1, 1, 1,
                1, 0, true, true, "none");
        this.numTimesSpawned += 1;
        return newBart;
    }
}
