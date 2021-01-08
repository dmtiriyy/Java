package Monopoly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            Monopoly myMono1 = new Monopoly(new ArrayList<>(), "Monopoly", MonopolyType.normal);

            Players players = new Players("Ukrainian", new ArrayList<>());
            players.addPlayer(new Players.Player("red", 1));
            players.addPlayer(new Players.Player("blue", 2));
            players.addPlayer(new Players.Player("green", 3));

            myMono1.addPart(players);
            myMono1.addPart(new Cells("Ukrainian", MonopolyType.normal, new Houses("Ukrainian", 20)));
            myMono1.addPart(new EventCards("Ukrainian"));
            myMono1.addPart(new Houses("Ukrainian", 20));
            myMono1.addPart(new Bank("Ukrainian", players));

            Monopoly myMono2 = new Monopoly(new ArrayList<>(), "Monopoly", MonopolyType.normal);

            Players players2 = new Players("Ukrainian", new ArrayList<>());
            players.addPlayer(new Players.Player("pink", 1));
            players.addPlayer(new Players.Player("purple", 2));
            players.addPlayer(new Players.Player("yellow", 3));

            myMono2.addPart(players2);
            myMono2.addPart(new Cells("Ukrainian", MonopolyType.normal, new Houses("Ukrainian", 20)));
            myMono2.addPart(new EventCards("Ukrainian"));
            myMono2.addPart(new Houses("Ukrainian", 20));
            myMono2.addPart(new Bank("Ukrainian", players));

            printMonopoly(myMono1);

            System.out.println();
            System.out.println(myMono1.equals(myMono2));

            System.out.println();
            System.out.println(players.equals(players2));

        }catch (MonopolyException e){
            System.err.println(e.getMessage());
        }

        System.out.println("\nSPLIT: ");
        String s = "a,b,c";
        System.out.println(Arrays.toString(s.split(",")));

        s = s + 1;
        System.out.println("\n" + s);

        /*adding lambdas and streams*/

        Players pls = new Players("Lab4", new ArrayList<>());
        pls.addPlayer(new Players.Player("red", 1));
        pls.addPlayer(new Players.Player("blue", 2));
        pls.addPlayer(new Players.Player("green", 3));
        pls.addPlayer(new Players.Player("pink", 4));
        pls.addPlayer(new Players.Player("purple", 5));
        pls.addPlayer(new Players.Player("yellow", 6));
        pls.print();

        System.out.println();

        System.out.println("1. Sum = " + pls.players.stream().filter(p -> p.getColor().equals("yellow") || p.getColor().equals("pink")).
                map(p -> p.getMoney()).reduce(0, (ac, cur) -> ac + cur, Integer::sum));

        System.out.println("\n2. Max = " + pls.players.stream().map(p -> p.getMoney()).max(Integer::compare).get());

        System.out.println("\n3. Avg = " + (double)(pls.players.stream().map(p -> p.getMoney()).
                reduce(0, (ac,cur) -> ac + cur, Integer::sum) / pls.players.size()));

//        System.out.println("\n4. Accepted: ");
//        pls.players.stream().filter(p -> p.getColor().equals("yellow") || p.getColor().equals("pink"))
//                .forEach(p -> p.print());
//        System.out.println("\n   Declined: ");
//        pls.players.stream().filter(p -> !(p.getColor().equals("yellow") || p.getColor().equals("pink")))
//                .forEach(p -> p.print());

        var result = pls.players.stream().collect(Collectors
                .groupingBy(item -> item.getColor().equals("yellow") || item.getColor().equals("pink") ? "accepted" : "declined"));

        System.out.println("Accepted: " + result.get("accepted").toString());
        System.out.println("Declined: " + result.get("declined").toString());


        Players pls2 = new Players("second", new ArrayList<>());
        pls.addPlayer((new Players.Player("brown", 1)));
        pls.addPlayer((new Players.Player("black", 2)));
        pls.addPlayer((new Players.Player("white", 3)));

        ArrayList<Players> teams = new ArrayList<Players>();
        teams.add(pls);
        teams.add(pls2);

        System.out.println("\n5. Sum of teams = " + teams.stream()
                .flatMap(team -> team.players.stream()).map(player -> player.getMoney())
                .reduce(0, (ac, cur) -> ac + cur, Integer::sum));

    }

    public static void printMonopoly(Monopoly myMono) {
        System.out.println("Your game:");
        System.out.println("Name: " + myMono.getName() + ", type: " + myMono.getMonopolyType());
        myMono.print();
    }
}
