package my_moves.Crabominable;

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
        //переопределяем метод describe, берем название класса стринговое и оно будет писаться как class.pokemon.Sample_Move. с помощью сплит делем на отдельные кусочки между точками и потом выбераем последний из них и подписываем по типу делает такую то атаку
    }

}
