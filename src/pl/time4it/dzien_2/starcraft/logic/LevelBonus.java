package pl.time4it.dzien_2.starcraft.logic;

public interface LevelBonus {

    void experienceBonus(Unit unit);
    void firePowerBonus(Unit unit);
    void defenceBonus(Unit unit);
    void fireRateBonus(Unit unit);
    void unitLevelBonus(Unit unit);
    void healthLevelBonus(Unit unit);
    void checkBonus(Unit unit);
    void increaseLevel(Unit unit);
}
