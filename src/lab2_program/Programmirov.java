package lab2_program;
import my_pokemos.*;
import ru.ifmo.se.pokemon.*;
public class Programmirov {
    //https://pokemondb.net/pokedex/oricorio
    //https://pokemondb.net/pokedex/crabrawler
    //https://pokemondb.net/pokedex/crabominable
    //https://pokemondb.net/pokedex/bounsweet
    //https://pokemondb.net/pokedex/steenee
    //https://pokemondb.net/pokedex/tsareena
    public static void main(String[] args) {
        start();
    }
    private static void start() {
        Battle b = new Battle();

        Oricorio_Pom_Pom p1 = new Oricorio_Pom_Pom("Желтые", 1);
        Crabrawler p2 = new Crabrawler("Черные",1);
        Crabominable p3 = new Crabominable("Белые",1);
        Bounsweet p4 = new Bounsweet("Зеленые",1);
        Steenee p5 = new Steenee("Синие",1);
        Tsareena p6 = new Tsareena("Красные",1);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
    public static boolean chance(double d) {
        return d > Math.random();
    }
}
