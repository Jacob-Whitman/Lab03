/**import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
    public class TomJerryUnitTest2 {
    @org.junit.Test
    public void getSymbolNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Symbol");
        assertEquals('T', tj.getSymbol());
    }
    @org.junit.Test
    public void getSymbolParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Symbol");
        assertEquals('T', tj.getSymbol());
    }
    @org.junit.Test
    public void getNameNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Name");
        assertEquals("Tom & Jerry", tj.getName());
    }
    @org.junit.Test
    public void getNameParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Name");
        assertEquals("Tom And Jerry", tj.getName());
    }
    @org.junit.Test
    public void getHealthNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Health");
        assertEquals(100.0, tj.getHealth(), 0.0001);
    }
    @org.junit.Test
    public void getHealthParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Health");
        assertEquals(100.0, tj.getHealth(), 0.0001);
    }
    @org.junit.Test
    public void getHealthModifierNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Health Modifier");
        assertEquals(0.0, tj.getHealthModifier(), 0.0001);
    }
    @org.junit.Test
    public void getHealthModifierParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Health Modifier");
        assertEquals(10.0, tj.getHealthModifier(), 0.0001);
    }
    @org.junit.Test
    public void getDamageNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Damage");
        assertEquals(25.0, tj.getDamage(), 0.0001);
    }
    @org.junit.Test
    public void getDamageParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Damage");
        assertEquals(25.0, tj.getDamage(), 0.0001);
    }
    @org.junit.Test
    public void getDamageModifierNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Damage Modifier");
        assertEquals(0.0, tj.getDamageModifier(), 0.0001);
    }
    @org.junit.Test
    public void getDamageModifierParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Damage Modifier");
        assertEquals(5.0, tj.getDamageModifier(), 0.0001);
    }
    @org.junit.Test
    public void getLuckNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Luck");
        assertEquals(0, tj.getLuck());
    }
    @org.junit.Test
    public void getLuckParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Luck");
        assertEquals(0, tj.getLuck());
    }
    @org.junit.Test
    public void getxCorNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing xCor");
        assertEquals(5, tj.getxCor());
    }
    @org.junit.Test
    public void getxCorParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing xCor");
        assertEquals(1, tj.getxCor());
    }
    @org.junit.Test
    public void getyCorNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing yCor");
        assertEquals(5, tj.getyCor());
    }
    @org.junit.Test
    public void getyCorParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing yCor");
        assertEquals(1, tj.getyCor());
    }
    @org.junit.Test
    public void getMovementNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Movement");
        assertEquals(1, tj.getMovement());
    }
    @org.junit.Test
    public void getMovementParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Movement");
        assertEquals(1, tj.getMovement());
    }
    @org.junit.Test
    public void getMovementModifierNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Movement Modifier");
        assertEquals(0, tj.getMovementModifier());
    }
    @org.junit.Test
    public void getMovementModifierParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Movement Modifier");
        assertEquals(1, tj.getMovementModifier());
    }
    @org.junit.Test
    public void canHomingRocketNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Homing Rocket");
        assertTrue(tj.canHomingRocket());
    }
    @org.junit.Test
    public void canHomingRocketParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Homing Rocket");
        assertTrue(tj.canHomingRocket());
    }
    @org.junit.Test
    public void canOfferCheeseNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Offer Cheese");
        assertTrue(tj.canOfferCheese());
    }
    @org.junit.Test
    public void canOfferCheeseParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Offer Cheese");
        assertTrue(tj.canOfferCheese());
    }
    @org.junit.Test
    public void isHidingNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Hiding");
        assertFalse(tj.isHiding());
    }
    @org.junit.Test
    public void isHidingParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Hiding");
        assertFalse(tj.isHiding());
    }
    @org.junit.Test
    public void setSymbolNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Symbol");
        tj.setSymbol('J');
        assertEquals('J', tj.getSymbol());
    }
    @org.junit.Test
    public void setSymbolParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Symbol");
        tj.setSymbol('J');
        assertEquals('J', tj.getSymbol());
    }
    @org.junit.Test
    public void setNameNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Name");
        tj.setName("Tom And Jerry");
        assertEquals("Tom And Jerry", tj.getName());
    }
    @org.junit.Test
    public void setNameParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Name");
        tj.setName("Tom & Jerry");
        assertEquals("Tom & Jerry", tj.getName());
    }
    @org.junit.Test
    public void setHealthNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Health");
        tj.setHealth(90.0);
        assertEquals(90.0, tj.getHealth(), 0.0001);
    }
    @org.junit.Test
    public void setHealthParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Health");
        tj.setHealth(90.0);
        assertEquals(90.0, tj.getHealth(), 0.0001);
    }
    @org.junit.Test
    public void setHealthModifierNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Health Modifier");
        tj.setHealthModifier(5.0);
        assertEquals(5.0, tj.getHealthModifier(), 0.0001);
    }
    @org.junit.Test
    public void setHealthModifierParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Health Modifier");
        tj.setHealthModifier(5.0);
        assertEquals(5.0, tj.getHealthModifier(), 0.0001);
    }
    @org.junit.Test
    public void setDamageNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Damage");
        tj.setDamage(23.0);
        assertEquals(23.0, tj.getDamage(), 0.0001);
    }
    @org.junit.Test
    public void setDamageParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Damage");
        tj.setDamage(20.0);
        assertEquals(20.0, tj.getDamage(), 0.0001);
    }
    @org.junit.Test
    public void setDamageModifierNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Damage Modifier");
        tj.setDamageModifier(7.0);
        assertEquals(7.0, tj.getDamageModifier(), 0.0001);
    }
    @org.junit.Test
    public void setDamageModifierParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Damage Modifier");
        tj.setDamageModifier(7.0);
        assertEquals(7.0, tj.getDamageModifier(), 0.0001);
    }
    @org.junit.Test
    public void setLuckNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Luck");
        tj.setLuck(95);
        assertEquals(95, tj.getLuck());
    }
    @org.junit.Test
    public void setLuckParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Luck");
        tj.setLuck(95);
        assertEquals(95, tj.getLuck());
    }
    @org.junit.Test
    public void setxCorNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing xCor");
        tj.setxCor(4);
        assertEquals(4, tj.getxCor());
    }
    @org.junit.Test
    public void setxCorParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing xCor");
        tj.setxCor(4);
        assertEquals(4, tj.getxCor());
    }
    @org.junit.Test
    public void setyCorNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing yCor");
        tj.setyCor(4);
        assertEquals(4, tj.getyCor());
    }
    @org.junit.Test
    public void setyCorParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing yCor");
        tj.setyCor(4);
        assertEquals(4, tj.getyCor());
    }
    @org.junit.Test
    public void setMovementNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Movement");
        tj.setMovement(0);
        assertEquals(0, tj.getMovement());
    }
    @org.junit.Test
    public void setMovementParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Movement");
        tj.setMovement(1);
        assertEquals(1, tj.getMovement());
    }
    @org.junit.Test
    public void setMovementModifierNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Movement Modifier");
        tj.setMovementModifier(2);
        assertEquals(2, tj.getMovementModifier());
    }
    @org.junit.Test
    public void setMovementModifierParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Movement Modifier");
        tj.setMovementModifier(2);
        assertEquals(2, tj.getMovementModifier());
    }
    @org.junit.Test
    public void setHomingRocketNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Homing Rocket");
        tj.setHomingRocket(false);
        assertFalse(tj.canHomingRocket());
    }
    @org.junit.Test
    public void setHomingRocketParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Homing Rocket");
        tj.setHomingRocket(false);
        assertFalse(tj.canHomingRocket());
    }
    @org.junit.Test
    public void setOfferCheeseNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Offer Cheese");
        tj.setOfferCheese(false);
        assertFalse(tj.canOfferCheese());
    }
    @org.junit.Test
    public void setOfferCheeseParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Offer Cheese");
        tj.setOfferCheese(false);
        assertFalse(tj.canOfferCheese());
    }
    @org.junit.Test
    public void setHidingNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Hiding");
        tj.setHiding(true);
        assertTrue(tj.isHiding());
    }
    @org.junit.Test
    public void setHidingParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Hiding");
        tj.setHiding(true);
        assertTrue(tj.isHiding());
    }
    @org.junit.Test
    public void dealDamageHidingNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Deal Damage");
        assertEquals(35.0, tj.dealDamage(), 0.0001);
        tj.setHomingRocket(false);
        assertEquals(25.0, tj.dealDamage(), 0.0001);
    }
    @org.junit.Test
    public void dealDamageHidingParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Deal Damage");
        assertEquals(40.0, tj.dealDamage(), 0.0001);
        tj.setHomingRocket(false);
        assertEquals(30.0, tj.dealDamage(), 0.0001);
    }
    @org.junit.Test
    public void takeDamageNonParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 0 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit();
        System.out.println("-- Testing Take Damage");
        tj.takeDamage(25.0);
        assertEquals(75.0, tj.getHealth(), 0.0001);
        tj.setHiding(true);
        tj.takeDamage(25.0);
        assertEquals(75.0, tj.getHealth(), 0.0001);
    }
    @org.junit.Test
    public void takeDamageParametizedConstructor() {
        System.out.println("Creating Tom & Jerry with 14 parameter constructor");
        TomJerryUnit tj = new TomJerryUnit('T', "Tom And Jerry", 100.0, 10.0,
                25.0, 5.0, 0, 1, 1, 1, 1,
                true, true, false);
        System.out.println("-- Testing Take Damage");
        tj.takeDamage(25.0);
        assertEquals(75.0, tj.getHealth(), 0.0001);
        tj.setHiding(true);
        tj.takeDamage(25.0);
        assertEquals(75.0, tj.getHealth(), 0.0001);
    }
}
 **/