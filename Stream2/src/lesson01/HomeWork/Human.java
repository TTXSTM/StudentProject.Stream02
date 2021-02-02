package lesson01.HomeWork;

public class Human implements Competitor {
    private String name;

    private int maxRunDistance;
    private int maxJumpHeigth;
    private int maxSwimDistance;

    private boolean active;

    public Human(String name) {

        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeigth = 300;
        this.maxSwimDistance = 20;
        this.active = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (name + " справился с кроссом!");
        } else {
            active = false;
            return (name + " не справился с кроссом!");

        }
    }

    @Override
    public String swim(int dist) {
        if (dist <= maxSwimDistance) {
            return (name + " справился с заплывом!");
        } else {
            active = false;
            return (name + " не справился с заплывом!");

        }
    }

    @Override
    public String jump(int height) {
        if (height <= maxJumpHeigth) {
            return (name + " справился с высотой!");
        } else {
            active = false;
            return (name + " не справился с высотой!");
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}