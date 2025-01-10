package my_moves.Crabrawler;

import lab2_program.Programmirov;
import ru.ifmo.se.pokemon.*;

public class Rock_Smash extends PhysicalMove {

    public Rock_Smash(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Programmirov.chance(0.5)) {
            super.applySelfEffects(p);
            Effect e = new Effect().stat(Stat.DEFENSE, +1);
        }
    }
}


