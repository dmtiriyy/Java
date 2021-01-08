package Monopoly;

public class Houses implements Parts {
    private int count;
    int price;

    public Houses(String themeOfMonopoly, int count) {
        super();
        if (count > 4) {
            this.count = 4;
        } else this.count = Math.max(count, 0);
        this.price = 100;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getPrice() {
        return this.price;
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

    }
}
