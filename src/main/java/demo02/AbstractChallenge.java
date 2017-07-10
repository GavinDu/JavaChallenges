package demo02;

/**
 * Created by Gavin Du on 7/10/2017.
 */
public class AbstractChallenge {
    static final int FORCE = 10;
    public static void main(String... args) {
        DarthVader darthVader = new DarthVader() {
            public int getNumber(int number) {
                return number;
            }
        };

        AbstractChallenge abstractChallenge = new AbstractChallenge();
        MasterYoda masterYoda = abstractChallenge.new MasterYoda() {
            public int getNumber(int number) {
                return number;
            }
        };

        System.out.println(darthVader.getNumber(FORCE) +
                            masterYoda.getNumber(new Integer(FORCE)));

        System.out.println("The stronger Jedi is: " +
                (darthVader.getNumber(FORCE) > masterYoda.getNumber(FORCE) ? "Darth Vader" : "Master Yoda"));
    }

    interface DarthVader {
        int getNumber(int number);
    }

    interface  LukeSkywalker extends DarthVader {
        int getNumber(int number);
    }

    abstract class MasterYoda implements LukeSkywalker {
        public int getNumber(Integer number) {
            return number + 10;
        }
    }
}
