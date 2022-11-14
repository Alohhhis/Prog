package mymoves.lurantis;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect EffectObject = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(EffectObject);
    }

    @Override
    protected String describe(){
        return "использует Low Sweep";
    }
    }

