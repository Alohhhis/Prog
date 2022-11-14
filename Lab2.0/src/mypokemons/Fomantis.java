package mypokemons;

import mymoves.fomantis.Leafage;
import mymoves.fomantis.Rest;
import mymoves.fomantis.Swagger;
import mymoves.suicune.Bulldoze;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Fomantis extends Pokemon {

    public Fomantis(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(40, 55, 35, 50, 35, 35);

        Leafage leafage = new Leafage(40, 100);
        Rest rest = new Rest(0, 0);
        Swagger swagger = new Swagger(0, 85);
        super.setMove(leafage, rest, swagger);
    }
}