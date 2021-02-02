package lesson01.HomeWork;

public class Cross extends Obstacle {

        private int length;

        public Cross(int length) {
            this.length = length;
        }

        @Override
        String doit(Competitor competitor) {
            return competitor.run(length);
        }
}
