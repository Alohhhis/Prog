package mypokemons;

import mymoves.bounsweet.DazzlingGleam;
import mymoves.steenee.PlayNice;
import mymoves.suicune.DoubleTeam;
import mymoves.tsareena.EnergyBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Pokemon {
    public Tsareena(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(72, 120, 98, 50, 98, 72);

        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        DazzlingGleam dazzlingGleam = new DazzlingGleam(80, 100);
        PlayNice playNice = new PlayNice(0, 100);
        EnergyBall energyBall = new EnergyBall(90, 100);
        super.setMove(doubleTeam, dazzlingGleam, playNice, energyBall);
    }
}
