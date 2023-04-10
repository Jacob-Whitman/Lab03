public class TomJerryUnit extends Unit {
    private boolean homingRocket;
    private boolean offerCheese;
    private boolean hiding;

    public TomJerryUnit(char symbol, String name, double health, double healthModifier, double damage,
                        double damageModifier, int luck, int xCor, int yCor, int movement,
                        int movementModifier, boolean homingRocket, boolean offerCheese, boolean hiding, String teamColor) {
        super(symbol, name, health, healthModifier, damage, damageModifier, luck,
                xCor, yCor, movement, movementModifier, teamColor);
        this.homingRocket = homingRocket;
        this.offerCheese = offerCheese;
        this.hiding = hiding;
    }
    public TomJerryUnit() {
        this('T', "Tom & Jerry", 100.0, 0.0, 25.0, 0.0, 0, 5, 5, 1, 0, true, true, false, "none");
    }
    public boolean canHomingRocket() {
        return this.homingRocket;
    }
    public boolean canOfferCheese() {
        return this.offerCheese;
    }
    public boolean isHiding() {
        return this.hiding;
    }
    public void setHomingRocket(boolean homingRocket) {
        this.homingRocket = homingRocket;
    }
    public void setOfferCheese(boolean offerCheese) {
        this.offerCheese = offerCheese;
    }
    public void setHiding(boolean hiding) {
        this.hiding = hiding;
    }
    public double dealDamage() {
        double damage = super.getDamage();
        double damageModifier = super.getDamageModifier();
        double totalDamage;
        totalDamage = damage + damageModifier;
        if (canHomingRocket()) {
            totalDamage += 10.0;
        }
        return totalDamage;
    }
    public void takeDamage(double damageTaken) {
        double health = super.getHealth();
        if (!isHiding()) {
            health -= damageTaken;
        }
    }
    public TomJerryUnit spawn() {
        TomJerryUnit newTomJerry = new TomJerryUnit('t', "Tom and Jerry", 100.0,
                5.0, 25.0, 10.0, 0, 1, 1, 1,
                1, true, true, true, "none");
        return newTomJerry;
    }
}