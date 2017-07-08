package demo01;

/**
 * Created by Gavin Du on 7/7/2017.
 */
public class PolymorphismQuestion {
    public static void main(String... args) {
        System.out.print(new Chris().getCharacter().getClass());
    }

    abstract static class STARSSoldier {
        public STARSSoldier getCharacter() {
            return new Chris();
        }
    }

    static class Chris extends STARSSoldier {
        @Override
        public Chris getCharacter() {
            return new Chris();
        }
    }
}
