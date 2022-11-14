package mymoves.suicune;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow, double acc) {

        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect EffectObject = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(EffectObject);
    }

    @Override
    protected String describe(){
        return "использует Double Team";
    }
}

