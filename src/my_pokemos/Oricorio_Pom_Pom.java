package my_pokemos;

import my_moves.my_moves_Oricorio_Pom_Pom.Calm_Mind;
import my_moves.my_moves_Oricorio_Pom_Pom.Confide;
import my_moves.my_moves_Oricorio_Pom_Pom.Double_Slap;
import my_moves.my_moves_Oricorio_Pom_Pom.Peck;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oricorio_Pom_Pom extends Pokemon {

    public Oricorio_Pom_Pom(String name, int level) {
        super(name, level);

        super.setType(Type.ELECTRIC, Type.FLYING);
        super.setStats(75, 70, 70, 98, 70, 93);

        Peck peck = new Peck(35, 100);
        super.setMove(peck);

        Calm_Mind calm_mind = new Calm_Mind(0, 0);
        super.setMove(calm_mind);

        Confide confide = new Confide(0, 0);
        super.setMove(confide);
    }
}



