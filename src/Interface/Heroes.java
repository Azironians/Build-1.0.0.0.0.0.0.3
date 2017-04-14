package Interface;

import Implements.Player;


public class Heroes {

    static class Devourer implements Player.Players {
        Double score = 0.0;
        private Double[] healthD = new Double[]{400.0, 480.0, 575.0, 690.0, 830.0, 995.0, 1195.0, 1430.0, 1720.0, 2065.0};
        private Double[] damageD = new Double[]{40.0, 48.0, 58.0, 69.0, 83.0, 100.0, 120.0, 143.0, 172.0, 207.0};
        private Double[] healingD = new Double[]{100.0,120.0,144.0,173.0,207.0,249.0,299.0,358.0,430.0,516.0};
        Double health;
        Double damage;
        Double healing;
        Devourer() {
            this.health=healthD[0];
            this.damage=damageD[0];
            this.healing=healingD[0];
        }

        @Override
        public Double getScore() {
            return score;
        }

        @Override
        public void setPlusScore(Double score) {
            this.score+=score;
        }
    }
}

