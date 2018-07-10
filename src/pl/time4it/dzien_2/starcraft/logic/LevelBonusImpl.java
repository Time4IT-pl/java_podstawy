package pl.time4it.dzien_2.starcraft.logic;

public class LevelBonusImpl implements LevelBonus {

    @Override
    public void experienceBonus(Unit unit) {
        unit.setExperience(unit.getExperience() + 40);
    }

    @Override
    public void firePowerBonus(Unit unit) {
        unit.setFirePower(unit.getFirePower() + 5);
    }

    @Override
    public void defenceBonus(Unit unit) {
        unit.setDefence(unit.getDefence() + 3);
    }

    @Override
    public void fireRateBonus(Unit unit) {
        unit.setFireRate( unit.getFireRate() + 0.2);
    }

    @Override
    public void unitLevelBonus(Unit unit) {
        unit.setUnitLevel(unit.getUnitLevel() + 1);

    }

    @Override
    public void healthLevelBonus(Unit unit) {
        unit.setHealthLevel(unit.getHealthLevel() + 10);

    }

    @Override
    public void checkBonus(Unit unit) {

        if( unit.getExperience() > 1) {
            if(unit.getExperience() % 100 == 1) {
                increaseLevel(unit);
            }
        }
}

    @Override
    public void increaseLevel(Unit unit) {
        unitLevelBonus(unit);
        experienceBonus(unit);
        firePowerBonus(unit);
        fireRateBonus(unit);
        defenceBonus(unit);
        healthLevelBonus(unit);

    }
}
