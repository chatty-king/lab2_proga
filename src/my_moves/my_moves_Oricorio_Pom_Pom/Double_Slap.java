package my_moves.my_moves_Oricorio_Pom_Pom;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Double_Slap extends PhysicalMove {

    public Double_Slap(double pow, double acc) {
        super(Type.NORMAL, pow, acc);


    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length - 1];
    }
}


