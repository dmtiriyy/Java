package Monopoly;

public class MonopolyException extends Throwable{
    public MonopolyException() {
        super("Impossible to create such monopoly");
    }
}
