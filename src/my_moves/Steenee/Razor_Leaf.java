package my_moves.Steenee;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Razor_Leaf extends PhysicalMove {

    public Razor_Leaf(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1d / 8d;
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
        //переопределяем метод describe, берем название класса стринговое и оно будет писаться как class.pokemon.Sample_Move. с помощью сплит делем на отдельные кусочки между точками и потом выбераем последний из них и подписываем по типу делает такую то атаку
    }

}