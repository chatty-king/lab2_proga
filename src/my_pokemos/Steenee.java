package my_pokemos;

import my_moves.Tsareena.Play_Nice;
import my_moves.Tsareena.Razor_Leaf;
import my_moves.Tsareena.Splash;
import ru.ifmo.se.pokemon.Type;

public class Steenee extends Bounsweet {

        public Steenee(String name, int level) {
            super(name, level);

            super.setType(Type.GRASS);
            super.setStats(52, 40, 48, 40, 48, 62);

            Play_Nice play_nice = new Play_Nice(0, 0);
            super.setMove(play_nice);

            Razor_Leaf razor_leaf = new Razor_Leaf(55, 95);
            super.setMove(razor_leaf);

            Splash splash = new Splash(0, 0);
            super.setMove(splash);
        }
}


