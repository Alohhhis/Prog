package mymoves.fomantis;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Leafage extends PhysicalMove {
    public Leafage(double pow, double acc) {

        super(Type.GRASS, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Leafage";
    }
}
