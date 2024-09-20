package ocp.conformation;

import java.util.List;

public class Attacker {

    public static void attackWithSuperHeroes(List<SuperHero> superHeroes) {
        for(int i = 0; i< superHeroes.size(); i++) {
            SuperHero superHero = superHeroes.get(i);
            superHero.attack();
        }
    }

}

/**
 * OPEN CLOSED PRINCIPLE
 * class should be open for extension but closed for modification
 */