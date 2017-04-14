package Class;

import Interface.Heroes;


public class LevelTab {
    private Double[] healthD = new Double[]{400.0, 480.0, 575.0, 690.0, 830.0, 995.0, 1195.0, 1430.0, 1720.0, 2065.0};
    private Double[] healthLV = new Double[]{300.0, 360.0, 430.0, 520.0, 625.0, 745.0, 895.0, 1075.0, 1300.0, 1550.0};
    private Double[] healthB = new Double[]{500.0, 600.0, 720.0, 865.0, 1035.0, 1245.0, 1490.0, 1790.0, 2150.0, 2560.0};
    private Double[] damageD = new Double[]{40.0, 48.0, 58.0, 69.0, 83.0, 100.0, 120.0, 143.0, 172.0, 207.0};
    private Double[] damageB = new Double[]{30.0, 36.0, 43.0, 52.0, 62.0, 74.0, 90.0, 108.0, 130.0, 155.0};
    private Double[] damageLV = new Double[]{50.0, 60.0, 72.0, 85.0, 104.0, 125.0, 149.0, 179.0, 215.0, 256.0};
    private Double[] healingB = new Double[]{};
    private Double[] healingLV = new Double[]{};
    private Double[] healingD = new Double[]{};

    public LevelTab(Heroes heroes) {

    }

    public Double getHealth(Integer level) {
        return healthD[level];
    }
    public Double getDamage(Integer level) {
        return damageD[level];
    }
    public Double getHealing(Integer level) {

        return null;
    }

}
