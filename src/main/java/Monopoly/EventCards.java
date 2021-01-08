package Monopoly;

import java.util.ArrayList;
import java.util.Collection;

public class EventCards implements Parts {
    public Collection<String> events;

    public EventCards(String themeOfMonopoly) {
        super();
        events = new ArrayList<>();
        events.add("+100$");
        events.add("+150$");
        events.add("+200$");
        events.add("+300$");
        events.add("-300$");
        events.add("-50$");
        events.add("-150$");
        events.add("-100$");
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
        for (String event : events) {
            System.out.print(event + " ");
        }
        System.out.println();
    }
}
