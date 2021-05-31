package lt.bit.p0525;

import intro.Man;

import java.time.LocalDate;

public class Game {

    public static void main(String[] args) {

        lt.bit.p0525.Stone stone = new lt.bit.p0525.Stone("Puntukas");
        lt.bit.p0525.Lake lake = new lt.bit.p0525.Lake("Tauragnu ez.");
        Man peasant = new Man("Peasant", 1);
        Man king = new Man("Adam IV", 99);
        Man queen = new Man("Victoria", 99);

        printAllTitles();
        printAllTitles(stone, lake);
        printAllTitles(peasant, king, queen);


        Object[] o = new Object[] {
                stone, queen, "Kuku", null, LocalDate.now(), 'A', 123, 3.14, false
        };
        System.out.println("*** Viso daiktu: " + countThings(o));

        if (o[1] instanceof String) {
            String s1 = (String) o[1];
            System.out.println(s1);
        }

    }

    static void printAllTitles(lt.bit.p0525.Thing... things) {
        for (lt.bit.p0525.Thing thing : things) {
            System.out.println(thing.getTitle());
        }
    }

    static int countThings(Object... objects) {
        System.out.println("*** Counting things: ");
        int counter = 0;
        for (Object obj : objects) {
            System.out.println(obj);
            if (obj instanceof lt.bit.p0525.Thing) {
                counter++;
            }
        }
        return counter;
    }
}