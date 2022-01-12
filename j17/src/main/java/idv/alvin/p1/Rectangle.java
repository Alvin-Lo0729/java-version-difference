package idv.alvin.p1;

/**
 * @author Alvin
 */
public sealed class Rectangle extends Shape permits Tasdf {

    @Override
    public void paint() {
        System.out.println("paint Rectangle");
    }
}
