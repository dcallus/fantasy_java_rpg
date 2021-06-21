package spells;

import player.Player;

public class ShieldSpell {
    String name;
    int numberOfMoves;

    public ShieldSpell(String name, int numberOfMoves) {
        this.name = name;
        this.numberOfMoves = numberOfMoves;
    }

    public void castShieldSpell(Player player){
        player.setShield(numberOfMoves);
    }

    public String getName() {
        return name;
    }

    public int getNumberOfMoves() {
        return numberOfMoves;
    }
}
