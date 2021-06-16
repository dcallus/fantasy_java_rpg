import org.junit.Before;
import org.junit.Test;
import player.fighter.Barbarian;
import player.fighter.Dwarf;
import player.fighter.Fighter;
import player.fighter.Knight;
import weapons.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WeaponTest {

    private Weapon dagger;
    private Weapon spiky;
    private Weapon battleAxe;
    private Fighter dwarf;
    private Fighter barb;
    private Fighter suge;

    @Before
    public void before() {
        dagger = new Sword("Small Dagger", WeaponSize.SIDEARM, 5, 20);
        spiky = new Club("Spiky Club", WeaponSize.LARGE, 15, 15);
        battleAxe = new Axe("Double-ended battle-axe", WeaponSize.XL, 20, 15);

        dwarf = new Dwarf("Clive");
        barb = new Barbarian("Barbara");
        suge = new Knight("Suge Knight");
    }

    @Test
    public void testDwarfCarryWeight() {
        dwarf.setWeapon(spiky);
        assertNotEquals(spiky, dwarf.getWeapon());
        dwarf.setWeapon(battleAxe);
        assertNotEquals(battleAxe, dwarf.getWeapon());
        dwarf.setWeapon(dagger);
        assertEquals(dagger, dwarf.getWeapon());
    }

    @Test
    public void testBarbCarryWeight() {
        barb.setWeapon(dagger);
        assertEquals(dagger, barb.getWeapon());
        barb.setWeapon(spiky);
        assertEquals(spiky, barb.getWeapon());
        barb.setWeapon(battleAxe);
        assertEquals(spiky, barb.getWeapon());
    }

    @Test
    public void testKnightCarryWeight() {
        suge.setWeapon(battleAxe);
        assertEquals(battleAxe, suge.getWeapon());
    }

    @Test
    public void testPlayerCanAttack(){
        suge.setWeapon(battleAxe);
        suge.attack(dwarf);
        assertEquals(80, dwarf.getHealthPoints());
    }

    @Test
    public void testPlayerCanAttackWithBareHands(){
        suge.attack(dwarf);
        assertEquals(99, dwarf.getHealthPoints());
    }
    
}
