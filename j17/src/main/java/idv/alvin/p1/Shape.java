package idv.alvin.p1;

/**
 * @author Alvin
 */
public sealed class Shape permits Circle, Rectangle, Square {


    public void paint() {
        System.out.println("paint");
    }
}
