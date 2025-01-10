package my_pokemos;

import my_moves.Crabrawler.Dizzy_Punch;
import my_moves.Crabrawler.Rock_Slide;
import my_moves.Crabrawler.Rock_Smash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Crabrawler extends Pokemon {

    public Crabrawler(String name, int level) {
        super(name, level);

        super.setType(Type.FIGHTING);
        super.setStats(47, 82, 57, 42, 47, 63);

        Dizzy_Punch dizzy_punch = new Dizzy_Punch(70, 100);
        super.setMove(dizzy_punch);

        Rock_Smash rock_smash = new Rock_Smash(40, 100);
        super.setMove(rock_smash);

        Rock_Slide rock_slide = new Rock_Slide(75, 90);
        super.setMove(rock_slide);
    }
}



