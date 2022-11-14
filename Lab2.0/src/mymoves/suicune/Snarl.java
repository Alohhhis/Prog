package mymoves.suicune;

import ru.ifmo.se.pokemon.*;

public class Snarl extends SpecialMove {
    public Snarl(double pow, double acc) {
        super(Type.DARK, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect EffectObject = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(EffectObject);
    }

    @Override
    protected String describe(){
        return "использует Snarl ";
    }
}

