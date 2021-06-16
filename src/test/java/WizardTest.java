import org.junit.Before;
import org.junit.Test;
import player.fighter.Dwarf;
import player.mage.Warlock;
import player.mage.Wizard;
import spells.Spell;
import spells.SpellType;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Spell spell;
    private Dwarf dwarf;
    private Warlock warlock;
    private Spell electricSpell;

    @Before
    public void before() {
        dwarf = new Dwarf("James");
        wizard = new Wizard("Gandalf");
        warlock = new Warlock("Jim");
        spell = new Spell("MeteorStrike", 40, SpellType.Fire);
        electricSpell = new Spell("Van Der Graaff Strike", 5, SpellType.Electricity);
    }

    @Test
    public void wizardHasDefaultSpell(){
        assertEquals("Electric Bolt", wizard.getSpell().getName());
    }

    @Test
    public void warlockHasDefaultSpell(){
        assertEquals("Fireball", warlock.getSpell().getName());
    }

    @Test
    public void wizardAttacksDwarfWithElectricity(){
        wizard.castSpell(dwarf);
        assertEquals(90, dwarf.getHealthPoints());
    }

    @Test
    public void warlockAttacksDwarfWithFire(){
        warlock.castSpell(dwarf);
        assertEquals(82, dwarf.getHealthPoints());
    }

    @Test
    public void wizardIsImmuneToElectricity(){
        warlock.setSpell(electricSpell);
        assertEquals(electricSpell, warlock.getSpell());
        warlock.castSpell(wizard);
        assertEquals(100, wizard.getHealthPoints());
    }

}
