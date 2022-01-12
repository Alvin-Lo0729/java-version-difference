package idv.alvin.jep213;

/**
 * @author Alvin
 */
public class Main implements CustomCalculator {
    public static void main(String[] args) {
        CustomCalculator demo = new Main();

        int sumOfEvens = demo.addEvenNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOfEvens);

        int sumOfOdds = demo.addOddNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOfOdds);

    }
}

