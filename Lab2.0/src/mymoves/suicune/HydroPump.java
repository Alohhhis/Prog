package mymoves.suicune;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {
    public HydroPump(double pow, double acc) {
        super(Type.WATER, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Hydro pump";
    }
}
