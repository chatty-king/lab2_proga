package my_pokemos;

import my_moves.Crabominable.Blizzard;
import my_moves.Crabrawler.Dizzy_Punch;
import my_moves.Crabrawler.Rock_Slide;
import my_moves.Crabrawler.Rock_Smash;
import ru.ifmo.se.pokemon.Type;

public class Crabominable extends Crabrawler {

    public Crabominable(String name, int level) {
        super(name, level);

        super.setType(Type.FIGHTING, Type.ICE);
        super.setStats(97, 132, 77, 62, 67, 43);

        Blizzard blizzard = new Blizzard(110, 70);
        super.setMove(blizzard);

        Dizzy_Punch dizzy_punch = new Dizzy_Punch(70, 100);
        super.setMove(dizzy_punch);

        Rock_Smash rock_smash = new Rock_Smash(40, 100);
        super.setMove(rock_smash);

        Rock_Slide rock_slide = new Rock_Slide(75, 90);
        super.setMove(rock_slide);
    }
}


