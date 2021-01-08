package Monopoly;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class Players implements Parts {
    public Collection<Player> players;

    public Players(String themeOfMonopoly, Collection<Player> players) {
        super();
        this.players = players;
    }

    public static class Player {
        private String color;
        private int money;
        private int id;

        public Player(String color, int id) {
            this.color = color;
            this.money = (int)(Math.random() * (1500 - 1000)) + 1000;
            this.id = id;
        }

        public String getColor() {
            return this.color;
        }

        public int getId(){return this.id;}

        public void setColor(String color) {
            this.color = color;
        }

        public void setColor() {
            this.color = "default";
        }

        public int getMoney() {
            return this.money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public void print() {
            StringBuffer sb = new StringBuffer();
            sb.append("Color = ");
            sb.append(this.color);
            sb.append(", money = ");
            sb.append(this.money);
            sb.append("\n");
            System.out.print(sb);
        }

        public String toString(){
            String str = getId() + " " + getColor();
            return str;
        }
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int playersMoney() {
        int sum = 0;
        for (Player player : players) {
            sum += player.getMoney();
        }
        return sum;
    }

    @Override
    public String getThemeOfMonopoly() {
        return null;
    }

    @Override
    public void setThemeOfMonopoly(String themeOfMonopoly) {

    }

    public void print() {
        System.out.println();
        for (Iterator<Player> iterator = players.iterator(); iterator.hasNext(); ) {
            Player player = iterator.next();
            player.print();
        }
    }
}

