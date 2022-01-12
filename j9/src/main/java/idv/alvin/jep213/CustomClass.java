package idv.alvin.jep213;

/**
 * @author Alvin
 */
public class CustomClass implements CustomInterface{

    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args){
        CustomInterface instance = new CustomClass();
        instance.method1();
        instance.method2();
        CustomInterface.method3();
    }


}
