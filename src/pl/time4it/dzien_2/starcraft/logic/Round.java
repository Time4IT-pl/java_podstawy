package pl.time4it.dzien_2.starcraft.logic;

import java.util.Random;

public class Round {

    public int nextRound() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
