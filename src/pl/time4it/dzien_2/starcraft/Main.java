package pl.time4it.dzien_2.starcraft;

import pl.time4it.dzien_2.starcraft.logic.Unit;
import pl.time4it.dzien_2.starcraft.terran.TerranUnit;
import pl.time4it.dzien_2.starcraft.terran.TerranUnitType;
import pl.time4it.dzien_2.starcraft.zerg.ZergUnit;
import pl.time4it.dzien_2.starcraft.zerg.ZergUnitType;

public class Main {


    public static void main(String[] args) {

        Unit zerg = new ZergUnit(ZergUnitType.HYDRALISK);
        Unit terran = new TerranUnit(TerranUnitType.GHOST);

        Unit[] units = {zerg, terran};


        for (int i = 0; i < 10; i++) {
            zerg.fight(zerg);
            System.out.println(zerg);
        }


        zerg.rumble(units);



    }
}
