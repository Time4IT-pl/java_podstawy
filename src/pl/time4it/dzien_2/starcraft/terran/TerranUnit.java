package pl.time4it.dzien_2.starcraft.terran;

import pl.time4it.dzien_2.starcraft.logic.Actions;
import pl.time4it.dzien_2.starcraft.logic.Unit;


public class TerranUnit extends Unit implements Actions {


    TerranUnitType terranUnitType;

    public TerranUnit(TerranUnitType terranUnitType) {
        this.terranUnitType = terranUnitType;

        switch (terranUnitType) {
            case GHOST:
                super.setExperience(1);
                super.setFirePower(23);
                super.setDefence(40);
                super.setFireRate(1.3);
                super.setUnitLevel(1);
                super.setHealthLevel(100);
                break;

            case MEDIC:
                super.setExperience(1);
                super.setFirePower(32);
                super.setDefence(34);
                super.setFireRate(1.1);
                super.setUnitLevel(1);
                super.setHealthLevel(210);
                break;

            case TRUPPER:
                super.setExperience(1);
                super.setFirePower(60);
                super.setDefence(20);
                super.setFireRate(1.8);
                super.setUnitLevel(1);
                super.setHealthLevel(190);
                break;
        }

    }

    @Override
    public String toString() {
        return "TerranUnit{" +
                "terranUnitType=" + terranUnitType +
                "} " + super.toString();
    }
}
