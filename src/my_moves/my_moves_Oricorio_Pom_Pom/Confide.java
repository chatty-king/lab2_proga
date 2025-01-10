package my_moves.my_moves_Oricorio_Pom_Pom;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide(double pow, double acc) {
        super(Type.NORMAL, pow, acc);


    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length - 1];
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(e);
    }
}

