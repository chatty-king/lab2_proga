package my_moves.my_moves_Oricorio_Pom_Pom;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Peck extends PhysicalMove  {

    public Peck(double pow, double acc) {
        super(Type.FLYING, pow, acc);


    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
    }
}


