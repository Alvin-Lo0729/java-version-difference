import idv.alvin.bean.Student;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/**
 * @author Alvin
 */
@Log
public class JAVA12Example {
    @Test
    public void collectorsTeeing() {


        List<Student> studentList = Arrays.asList(
                Student.of("A", ThreadLocalRandom.current().nextInt(0, 101)),
                Student.of("B", ThreadLocalRandom.current().nextInt(0, 101)),
                Student.of("C", ThreadLocalRandom.current().nextInt(0, 101)),
                Student.of("D", ThreadLocalRandom.current().nextInt(0, 101)),
                Student.of("E", ThreadLocalRandom.current().nextInt(0, 101)),
                Student.of("F", ThreadLocalRandom.current().nextInt(0, 101)));

        String teeingResult = studentList.stream().collect(
                Collectors.teeing(

                        Collectors.averagingInt(new ToIntFunction<Student>() {

                            @Override
                            public int applyAsInt(Student student) {
                                return student.getMathScore();
                            }
                        }),
                        Collectors.summingInt(new ToIntFunction<Student>() {
                            @Override
                            public int applyAsInt(Student value) {
                                log.info(value.toString());
                                return value.getMathScore();
                            }
                        }),
                        new BiFunction<Double, Integer, String>() {
                            @Override
                            public String apply(Double aDouble, Integer integer) {
                                return aDouble.toString() + " : " + integer.toString();
                            }
                        }
                )
        );
        log.info(teeingResult);
    }

    @Test
    public void stringIndent() {
        String result = "foo\nbar\nbar2";

        System.out.println(result.indent(9));


    }

    @Test
    public void stringTransform() {
        List<String> names = List.of(
                "   Alex",
                "brian");

        List<String> transformedNames = new ArrayList<>();

        for (String name : names) {
            String transformedName = name.transform(String::strip)
                    .transform(new Function<String, String>() {
                        @Override
                        public String apply(String s) {
                            return s.toUpperCase();
                        }
                    });

            transformedNames.add(transformedName);
        }
        transformedNames.forEach(ele -> log.info("ele : " + ele));


        String wasd = new String("sadAasdF");
        String tr2 = wasd.transform(new Function<String, String>() {

            /**
             * Applies this function to the given argument.
             *
             * @param s the function argument
             * @return the function result
             */
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        });
        System.out.println(tr2);
    }

    @Test
    public void stringConstants() {
        String value = "newrasAdasfd";

    }

    @Test
    public void compactNumberFormatting() {
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.TAIWAN, NumberFormat.Style.SHORT);
        System.out.println(formatter.format(953000.0));
        String formattedString = formatter.format(953000L);
        log.info(formattedString);
    }

}
