package weapons;

public enum WeaponSize {
    SIDEARM(1),
    SMALL(2),
    MEDIUM(3),
    LARGE(4),
    XL(5);

    private int value;

    WeaponSize(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}
