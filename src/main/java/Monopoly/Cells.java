package Monopoly;

public class Cells implements Parts {
    int count;
    private MonopolyType type;
    Houses house;

    public Cells(String themeOfMonopoly, MonopolyType type, Houses house) {
        super();
        if (type == MonopolyType.small) {
            this.count = 25;
        } else if (type == MonopolyType.normal) {
            this.count = 35;
        } else if (type == MonopolyType.extended) {
            this.count = 50;
        } else {
            System.out.println("Invalid type!");
        }
        this.house = house;
    }

    public void buildHouse(){
        house.setCount(house.getCount() + 1);
    }

    public int getHouseCount() {
        return house.getCount();
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
        System.out.println("\nCount of cells = " + this.count);
    }
}
