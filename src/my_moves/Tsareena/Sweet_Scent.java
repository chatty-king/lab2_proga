package my_moves.Tsareena;

import ru.ifmo.se.pokemon.*;

public class Sweet_Scent extends StatusMove {

    public Sweet_Scent(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.EVASION, -1);
    }
}


