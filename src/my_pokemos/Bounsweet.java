package my_pokemos;

import my_moves.Tsareena.Razor_Leaf;
import my_moves.Tsareena.Splash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {

    public Bounsweet(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS);
        super.setStats(42, 30, 38, 30, 38, 32);

        Razor_Leaf razor_leaf = new Razor_Leaf(55, 95);
        super.setMove(razor_leaf);

        Splash splash = new Splash(0, 0);
        super.setMove(splash);
    }
}


