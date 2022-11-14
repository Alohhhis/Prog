package mymoves.tsareena;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Pokemon;
import utils.Utils1;

public class EnergyBall extends SpecialMove {
    public EnergyBall(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect EffectObject = new Effect();
        if (Utils1.chance(0.1)) {
            EffectObject.stat(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe(){
        return "использует Energy Ball ";
    }
}
