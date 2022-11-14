package mypokemons;

import mymoves.suicune.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Suicune extends Pokemon {

    public Suicune(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(100, 75, 115, 90, 115, 85);

        HydroPump hydroPump = new HydroPump(110, 80);
        Snarl snarl = new Snarl(55, 95);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        Bulldoze bulldoze = new Bulldoze(60, 100);
        super.setMove(hydroPump, snarl, doubleTeam, bulldoze);
    }
}