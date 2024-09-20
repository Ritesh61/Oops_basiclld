package ocp.violation;

import common.data.SuperHero;

import java.util.List;

public class Attacker {

    public void attackWithSuperHeroes(List<SuperHero> superHeroes) {
        for (SuperHero superHero : superHeroes) {
            switch (superHero) {
                case CAPTAIN_AMERICA:
                    superHero.attackWithCaptainAmerica();
                    break;
                case BAT_MAN:
                    superHero.attackWithBatman();
                    break;
                case IRON_MAN:
                    superHero.attackWithIronMan();
                    break;
            }
        }
    }
}
