package mymoves.steenee;

import ru.ifmo.se.pokemon.*;

public class PlayNice extends StatusMove {
    public PlayNice(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect EffectObject = new Effect().stat(Stat.ATTACK, -1);
        p.addEffect(EffectObject);
    }

    @Override
    protected String describe(){
        return "использует Play Nice";
    }
}
