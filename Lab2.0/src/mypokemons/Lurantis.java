package mypokemons;

import mymoves.fomantis.Leafage;
import mymoves.fomantis.Rest;
import mymoves.fomantis.Swagger;
import mymoves.lurantis.LowSweep;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lurantis extends Pokemon {
    public Lurantis(String name, int level) {
        super(name, level);
        super.setType(Type.GRASS);
        super.setStats(70, 105, 90, 80, 90, 45);

        Leafage leafage = new Leafage(40, 100);
        Rest rest = new Rest(0, 0);
        Swagger swagger = new Swagger(0, 85);
        LowSweep lowSweep = new LowSweep(65, 100);
        super.setMove(leafage, rest, swagger, lowSweep);
    }
}
