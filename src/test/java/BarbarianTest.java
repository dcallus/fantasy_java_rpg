import org.junit.Before;
import org.junit.Test;
import player.fighter.Barbarian;
import spells.SpellType;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Fred");
    }

    @Test
    public void hasInitialDamageModifier(){
        assertEquals(0.9,barbarian.getDamageModifier(SpellType.Fire), 0.00);
    }

    @Test
    public void hasInitialIceModifier(){
        assertEquals(1.3,barbarian.getDamageModifier(SpellType.Ice), 0.00);
    }

    @Test
    public void hasInitialElectricityModifier(){
        assertEquals(0.5,barbarian.getDamageModifier(SpellType.Electricity), 0.00);
    }
}
