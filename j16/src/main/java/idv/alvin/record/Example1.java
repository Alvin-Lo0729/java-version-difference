package idv.alvin.record;

import lombok.extern.java.Log;

/**
 * @author Alvin
 */
@Log
public class Example1 {
    public static void main(String[] asr) {
        record Kkw(String a, String b) {
            @Override
            public String a() {
                return a+"rrrr";
            }

            public String getValue() {
                return a + b;
            }
        }
        Kkw kkw = new Kkw("aaaa", "bbbb");
        System.out.println(kkw.getValue());
        System.out.println(kkw.a());
        System.out.println(kkw.a);
    }

    public record Book(String title, String author, String isbn) {
        @Override
        public String title() {
            return title + "dsafasd";
        }

        @Override
        public String author() {
            return author + "11152";
        }

        @Override
        public String isbn() {
            return isbn + "你好";
        }
    }
}
