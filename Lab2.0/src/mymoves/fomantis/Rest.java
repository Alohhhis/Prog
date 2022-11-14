package mymoves.fomantis;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest(double pow, double acc) {

        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon att) {
        Effect EffectObject = new Effect().condition(Status.SLEEP).turns(2);
        att.restore();
        att.addEffect(EffectObject);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe(){
        return "использует rest";
    }

}