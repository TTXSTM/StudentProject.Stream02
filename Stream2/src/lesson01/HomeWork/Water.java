package lesson01.HomeWork;

public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    String doit(Competitor competitor) {
        return competitor.swim(length);
    }
}