package idv.alvin;

import idv.alvin.p1.*;

/**
 * @author Alvin
 */
public class Jep365Example {
    public static void main(String[] args) {

//        RandomGenerator randomGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(999);
//        for (var i = 0; i < 10; i++) {
//            System.out.println(randomGenerator.nextInt(0, 11));
//        }


        Shape shape = test();
        Shape ww;
        if (shape instanceof Circle a) {
            ww = a;
        } else if (shape instanceof Tasdf tt) {
            ww = tt;
        } else if (shape instanceof Rectangle b) {
            ww = b;
        } else if (shape instanceof Awc e) {
            ww = e;
        } else if (shape instanceof Square c) {
            ww = c;
        } else {
            ww = null;
        }
        ww.paint();

    }

    public static Shape test() {
        return new Tasdf();
    }

}
