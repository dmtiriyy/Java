package Monopoly;

import java.util.Collection;

public class Monopoly {
    private final Collection<Parts> parts;
    private final String name;
    private final MonopolyType type;

    public Monopoly(Collection<Parts> parts, String name, MonopolyType type) throws MonopolyException{
        this.parts = parts;
        this.name = name;
        this.type = type;
    }

    public void addPart(Parts part) {
        this.parts.add(part);
    }

    public String getName() {
        return this.name;
    }

    public MonopolyType getMonopolyType() {
        return this.type;
    }

    public void print() {
        for (Parts part : parts) {
            part.print();
        }
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Monopoly monopoly = (Monopoly) obj;
        return name.equals(monopoly.name) && parts == monopoly.parts && type == monopoly.type;
    }
}
