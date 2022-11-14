package mypokemons;


import mymoves.bounsweet.DazzlingGleam;
import mymoves.steenee.PlayNice;
import mymoves.suicune.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Steenee extends Pokemon {
    public Steenee(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(52, 40, 48, 40, 48, 62);

        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        DazzlingGleam dazzlingGleam = new DazzlingGleam(80, 100);
        PlayNice playNice = new PlayNice(0, 100);
        super.setMove(doubleTeam, dazzlingGleam, playNice);
    }
}