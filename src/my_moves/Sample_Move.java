package my_moves;

import ru.ifmo.se.pokemon.*;

public class Sample_Move extends PhysicalMove {

    public Sample_Move(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE, - 1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
        //переопределяем метод describe, берем название класса стринговое и оно будет писаться как class.pokemon.Sample_Move. с помощью сплит делем на отдельные кусочки между точками и потом выбераем последний из них и подписываем по типу делает такую то атаку
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1d / 8d;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, +1);
        }
}