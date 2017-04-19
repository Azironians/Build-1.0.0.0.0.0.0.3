package Interface;
import Implements.Player;

import java.util.List;

public class Hero {
    private String name;
    private byte attack;
    private byte treatment;
    private byte hitPoints;
    private byte supplyHealth;
    private byte levelHero;
    private List<Skill> skills;

    public Hero(String name, byte attack, byte treatment, byte hitPoints, byte supplyHealth, byte levelHero, List<Skill> skills) {
        this.name = name;
        this.attack = attack;
        this.treatment = treatment;
        this.hitPoints = hitPoints;
        this.supplyHealth = supplyHealth;
        this.levelHero = levelHero;
        this.skills = skills;
    }
    //Getters and Setters

    public byte getAttack() {
        return attack;
    }

    public void setAttack(byte attack) {
        this.attack = attack;
    }

    public byte getTreatment() {
        return treatment;
    }

    public void setTreatment(byte treatment) {
        this.treatment = treatment;
    }

    public byte getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(byte hitPoints) {
        this.hitPoints = hitPoints;
    }

    public byte getSupplyHealth() {
        return supplyHealth;
    }

    public void setSupplyHealth(byte supplyHealth) {
        this.supplyHealth = supplyHealth;
    }

    public byte getLevelHero() {
        return levelHero;
    }

    public void setLevelHero(byte levelHero) {
        this.levelHero = levelHero;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
    //Static class Devourer:


    static class Devourer implements Player.Players {
        Double score = 0.0;
        private Double[] healthD = new Double[]{400.0, 480.0, 575.0, 690.0, 830.0, 995.0, 1195.0, 1430.0, 1720.0, 2065.0};
        private Double[] damageD = new Double[]{40.0, 48.0, 58.0, 69.0, 83.0, 100.0, 120.0, 143.0, 172.0, 207.0};
        private Double[] healingD = new Double[]{100.0,120.0,144.0,173.0,207.0,249.0,299.0,358.0,430.0,516.0};
        Double health;
        Double damage;
        Double healing;
        Devourer() {
            this.health = healthD[0];
            this.damage = damageD[0];
            this.healing = healingD[0];
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

