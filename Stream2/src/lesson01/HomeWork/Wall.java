package lesson01.HomeWork;

public class Wall extends Obstacle {
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    String doit(Competitor competitor) {
        return competitor.jump(heigth);
    }
}