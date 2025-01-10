package my_moves.Crabominable;

import lab2_program.Programmirov;
import ru.ifmo.se.pokemon.*;

public class Rock_Smash extends PhysicalMove {

    public Rock_Smash(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
        //переопределяем метод describe, берем название класса стринговое и оно будет писаться как class.pokemon.Sample_Move. с помощью сплит делем на отдельные кусочки между точками и потом выбераем последний из них и подписываем по типу делает такую то атаку
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Programmirov.chance(0.5)) {
            super.applySelfEffects(p);
            Effect e = new Effect().stat(Stat.DEFENSE, +1);
        }
    }

}
