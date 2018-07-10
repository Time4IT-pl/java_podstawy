package pl.time4it.dzien_2.starcraft.zerg;

import pl.time4it.dzien_2.starcraft.logic.Unit;

public class ZergUnit extends Unit {

    ZergUnitType zergUnitType;

    public ZergUnit(ZergUnitType zergUnitType) {
        this.zergUnitType = zergUnitType;

        switch (zergUnitType) {
            case HYDRALISK:
                super.setExperience(1);
                super.setFirePower(23);
                super.setDefence(40);
                super.setFireRate(1.3);
                super.setUnitLevel(1);
                super.setHealthLevel(100);
                break;

            case ULTRALISK:
                super.setExperience(1);
                super.setFirePower(32);
                super.setDefence(34);
                super.setFireRate(1.1);
                super.setUnitLevel(1);
                super.setHealthLevel(210);
                break;

            case QUEEN:
                super.setExperience(1);
                super.setFirePower(60);
                super.setDefence(20);
                super.setFireRate(1.8);
                super.setUnitLevel(1);
                super.setHealthLevel(190);
                break;

            case ROACH:
                super.setExperience(1);
                super.setFirePower(30);
                super.setDefence(70);
                super.setFireRate(2.1);
                super.setUnitLevel(1);
                super.setHealthLevel(10);
                break;

            case ZERGLING:
                super.setExperience(1);
                super.setFirePower(19);
                super.setDefence(40);
                super.setFireRate(3.1);
                super.setUnitLevel(1);
                super.setHealthLevel(20);
                break;


        }

    }

    @Override
    public String toString() {
        return "ZergUnit{" +
                "zergUnitType=" + zergUnitType +
                "} " + super.toString();
    }
}
