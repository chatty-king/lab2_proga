package my_pokemos;

import my_moves.Tsareena.Play_Nice;
import my_moves.Tsareena.Razor_Leaf;
import my_moves.Tsareena.Splash;
import my_moves.Tsareena.Sweet_Scent;
import ru.ifmo.se.pokemon.Type;

public class Tsareena extends Steenee {

        public Tsareena(String name, int level) {
            super(name, level);

            super.setType(Type.GRASS);
            super.setStats(72, 120, 98, 50, 98, 72);

            Play_Nice play_nice = new Play_Nice(0, 0);
            super.setMove(play_nice);

            Sweet_Scent sweet_scent = new Sweet_Scent(0, 100);
            super.setMove(sweet_scent);

            Razor_Leaf razor_leaf = new Razor_Leaf(55, 95);
            super.setMove(razor_leaf);

            Splash splash = new Splash(0, 0);
            super.setMove(splash);
        }
}


