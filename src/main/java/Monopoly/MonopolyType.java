package Monopoly;

public enum MonopolyType {
    small,
    normal,
    extended;

    @Override
    public String toString() {
        return super.toString().toUpperCase();
    }
}

