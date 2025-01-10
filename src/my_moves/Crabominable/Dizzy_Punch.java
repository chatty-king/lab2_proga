package my_moves.Crabominable;

import lab2_program.Programmirov;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dizzy_Punch extends PhysicalMove {

    public Dizzy_Punch(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Programmirov.chance(0.2)) {
            Effect.confuse(p);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
        //переопределяем метод describe, берем название класса стринговое и оно будет писаться как class.pokemon.Sample_Move. с помощью сплит делем на отдельные кусочки между точками и потом выбераем последний из них и подписываем по типу делает такую то атаку
    }

}