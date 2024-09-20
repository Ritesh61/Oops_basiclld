package ocp.conformation;

import java.util.ArrayList;
import java.util.List;

public class AttackerSimulator {

    public static void main(String[] args) {
        List<SuperHero> superHeroes = new ArrayList<SuperHero>();
        superHeroes.add(new Batman());
        superHeroes.add(new IronMan());
        superHeroes.add(new CaptainAmerica());
        Attacker.attackWithSuperHeroes(superHeroes);
    }
}
