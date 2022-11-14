package mypokemons;

import mymoves.bounsweet.DazzlingGleam;
import mymoves.suicune.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {
    public Bounsweet(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(42, 30, 38, 30, 38, 32);

        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        DazzlingGleam dazzlingGleam = new DazzlingGleam(80, 100);
        super.setMove(doubleTeam, dazzlingGleam);
    }
}
