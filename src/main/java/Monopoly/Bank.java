package Monopoly;

public class Bank implements Parts {
    private final int allMoney;
    private Players players;

    public Bank(String themeOfMonopoly, Players players) {
        super();
        this.players = players;
        this.allMoney = 20000;
    }

    public int leftInBank() {
        return allMoney - players.playersMoney();
    }

    @Override
    public String getThemeOfMonopoly() {
        return null;
    }

    @Override
    public void setThemeOfMonopoly(String themeOfMonopoly) {

    }

    @Override
    public void print() {
        System.out.println("\nAll money in game = " + this.allMoney);
        System.out.println("Money in the bank now = " + this.leftInBank());
        System.out.println("Players money = " + (this.allMoney - this.leftInBank()));
    }
}
