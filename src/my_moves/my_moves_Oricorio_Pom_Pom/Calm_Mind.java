package my_moves.my_moves_Oricorio_Pom_Pom;

import ru.ifmo.se.pokemon.*;

public class Calm_Mind extends StatusMove {

    public Calm_Mind(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length - 1];
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, +1);
        Effect r = new Effect().stat(Stat.SPECIAL_DEFENSE, +1);
    }
}


