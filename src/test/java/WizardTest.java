import org.junit.Before;
import org.junit.Test;
import player.fighter.Dwarf;
import player.mage.Warlock;
import player.mage.Wizard;
import spells.Heal;
import spells.ShieldSpell;
import spells.Spell;
import spells.SpellType;
import weapons.Sword;
import weapons.WeaponSize;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Spell spell;
    private Dwarf dwarf;
    private Warlock warlock;
    private Spell electricSpell;
    private Sword dagger;
    private Heal healPotion;
    private Spell iceSpell;
    private ShieldSpell shieldSpell;

    @Before
    public void before() {
        dagger = new Sword("Dagger", WeaponSize.SIDEARM, 10, 20);
        dwarf = new Dwarf("James");
        wizard = new Wizard("Gandalf");
        warlock = new Warlock("Jim");
        spell = new Spell("MeteorStrike", 40, SpellType.Fire);
        electricSpell = new Spell("Van Der Graaff Strike", 5, SpellType.Electricity);
        iceSpell = new Spell("Ice Storm", 20, SpellType.Ice);
        healPotion = new Heal("Holy Water", 20);
        shieldSpell = new ShieldSpell("averageShield", 5);
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

    @Test
    public void wizardTakesMoreDamageFromWeapon(){
        dwarf.setWeapon(dagger);
        dwarf.attack(wizard);
        assertEquals(85, wizard.getHealthPoints());
    }

    @Test
    public void wizardHealsDwarf(){
        wizard.healAPlayer(dwarf, healPotion);
        assertEquals(120, dwarf.getHealthPoints());
    }

    @Test
    public void wizardNotDefendsDwarf() {
        warlock.castSpell(dwarf);
        assertEquals(82, dwarf.getHealthPoints());
    }

    @Test
    public void wizardDefendsDwarfFromFire() {
        wizard.defendAPlayer(SpellType.Fire, 0.5, dwarf);
        warlock.castSpell(dwarf);
        assertEquals(95, dwarf.getHealthPoints());
    }

    @Test
    public void wizardDefendsDwarfFromIce() {
        wizard.defendAPlayer(SpellType.Ice, 0.5, dwarf);
        warlock.setSpell(iceSpell);
        warlock.castSpell(dwarf);
        assertEquals(90, dwarf.getHealthPoints());
    }

    @Test
    public void wizardDefendsDwarfFromLightning() {
        wizard.defendAPlayer(SpellType.Electricity, 0.5, dwarf);
        wizard.castSpell(dwarf);
        assertEquals(95, dwarf.getHealthPoints());
    }

    @Test
    public void wizardCastsShieldSpellBlocksMagic() {
        //dwarf immune to damage for 5 moves!
        wizard.shieldAPlayer(dwarf, shieldSpell);
        wizard.castSpell(dwarf);
        wizard.castSpell(dwarf);
        wizard.castSpell(dwarf);
        wizard.castSpell(dwarf);
        wizard.castSpell(dwarf);
        wizard.castSpell(dwarf);
        assertEquals(90, dwarf.getHealthPoints());
    }

    @Test
    public void wizardCastsShieldSpellBlocksAttack() {
        //dwarf immune to damage for 5 moves!
        wizard.shieldAPlayer(dwarf, shieldSpell);
        wizard.attack(dwarf);
        wizard.attack(dwarf);
        wizard.attack(dwarf);
        wizard.attack(dwarf);
        wizard.attack(dwarf);
        wizard.attack(dwarf);
        assertEquals(99, dwarf.getHealthPoints());
    }


}
