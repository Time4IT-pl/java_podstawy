package pl.time4it.dzien_2.starcraft.logic;

public class Unit extends LevelBonusImpl implements Actions{

    private int experience;
    private int firePower;
    private int defence;
    private double fireRate;
    private int unitLevel;
    private int healthLevel;


    public Unit() { }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public double getFireRate() {
        return fireRate;
    }

    public void setFireRate(double fireRate) {
        this.fireRate = fireRate;
    }

    public int getUnitLevel() {
        return unitLevel;
    }

    public void setUnitLevel(int unitLevel) {
        this.unitLevel = unitLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    @Override
    public void fight(Unit unit) {
        unit.experienceBonus(unit);
        unit.checkBonus(unit);
    }

    @Override
    public Unit rumble(Unit[] units) {
        Round round = new Round();
        boolean flag = true;

        while(flag) {
           int result = round.nextRound();
            if(result % 2 == 0) {
                units[0].fight(units[0]);
                units[1].setHealthLevel(
                        units[1].getHealthLevel() -
                        units[0].getFirePower());
                if(units[1].getHealthLevel() <= 0) {
                    flag = false;
                }
            } else {
                units[1].fight(units[1]);
                units[0].setHealthLevel(
                        units[0].getHealthLevel() -
                                units[1].getFirePower());
                if(units[0].getHealthLevel() <= 0) {
                    flag = false;
                }
            }

        }

        for (int i = 0; i < units.length; i++) {

            if(units[i].getHealthLevel() > 0) {
                System.out.println("WIN: " + units[i]);
                return units[i];
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "experience=" + experience +
                ", firePower=" + firePower +
                ", defence=" + defence +
                ", fireRate=" + fireRate +
                ", unitLevel=" + unitLevel +
                ", healthLevel=" + healthLevel;

    }
}
