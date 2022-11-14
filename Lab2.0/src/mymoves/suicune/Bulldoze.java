package mymoves.suicune;

import ru.ifmo.se.pokemon.*;


public class Bulldoze extends PhysicalMove {
    public Bulldoze(double pow, double acc) {
        super(Type.GROUND, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect EffectObject = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(EffectObject);
    }

    @Override
    protected String describe(){
        return "использует Bulldoze";
    }
}
