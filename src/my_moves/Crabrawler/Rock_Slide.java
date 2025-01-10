package my_moves.Crabrawler;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rock_Slide  extends PhysicalMove {

    public Rock_Slide (double pow, double acc) {
        super(Type.ROCK, pow, acc);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
    }

}
