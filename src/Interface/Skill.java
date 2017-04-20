package Interface;


public class Skill {
    private byte coultdown;
    private byte necessaryLevel;

    public boolean isOpenSkill(Hero hero){
        return true; // this.coultdown == 0 && this.necessaryLevel >= hero.getLevelHero();
    }
    //Getters and Setters
    public byte getCoultdown() {
        return coultdown;
    }

    public void setCoultdown(byte coultdown) {
        this.coultdown = coultdown;
    }

    public byte getNecessaryLevel() {
        return necessaryLevel;
    }

    public void setNecessaryLevel(byte necessaryLevel) {
        this.necessaryLevel = necessaryLevel;
    }
}
