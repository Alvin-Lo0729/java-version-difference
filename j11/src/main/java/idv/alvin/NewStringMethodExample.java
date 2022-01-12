package idv.alvin;

/**
 * @author Alvin
 */
public class NewStringMethodExample {
    public static void main(String[] args) {
        // 判斷字串是否空白
        System.out.println(" ".isBlank());

        // 去除首尾空格
        System.out.println(" Javastack　　".strip());        // "Javastack"

        System.out.println("　Javastack　".trim());

        // 去除尾部空格
        System.out.println(" Javastack ".stripTrailing());  // " Javastack"

        // 去除首部空格
        System.out.println(" Javastack ".stripLeading());   // "Javastack "

        //複製字串
        System.out.println("Java".repeat(3));             // "JavaJavaJava"

        //行數統計
        System.out.println("A\nB\nadfasd".lines().count());    // 3


    }
}
