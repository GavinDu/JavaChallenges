package demo02;

import java.util.Arrays;

/**
 * Created by Gavin Du on 7/10/2017.
 */
public class EnumChallenge {
    interface Invoker {
        DragonBalls[] invokeShenLong();
    }
    enum DragonBalls implements Invoker {
        FIRST, SECOND, THIRD, FOURTH, FIFTH, SIXTH, SEVENTH;

        public DragonBalls[] invokeShenLong() {
            return DragonBalls.values();
        }
    }

    public static void main(String... args) {
        DragonBalls dragonBall1 = DragonBalls.FIFTH;
        DragonBalls dragonBall2 = DragonBalls.SECOND;

        DragonBalls[] dragonBalls = DragonBalls.FIRST.SECOND.THIRD.FOURTH.SIXTH.invokeShenLong();

        System.out.println(Arrays.toString(dragonBalls));
        for (DragonBalls dragonBall : dragonBalls) {
            if (dragonBall.equals(dragonBall1))
                break;
            dragonBall2 = dragonBall1;


        }

        System.out.println(dragonBall2 == dragonBall1 ?
            "Same dragon ball" : "new dragon ball");
        System.out.println(dragonBall2);
    }
}
