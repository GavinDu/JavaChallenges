package demo01;

/**
 * Created by Gavin Du on 7/8/2017.
 */
public class BigBangTheory {
    public static void main(String... args) {
        Scientist scientist = new Sheldon() {
            @Override
            public void search() {
                System.out.print("This is my new spot!");
            }
        };

        scientist.search();
    }

    interface Scientist {
        void search();
    }

    static class Sheldon implements Scientist {
        public void search() {
            System.out.print("This is my spot.");
        }
    }
}
