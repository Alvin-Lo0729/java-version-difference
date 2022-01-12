package idv.alvin.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Alvin
 */
@Data
@ToString
@EqualsAndHashCode

public class Student implements Serializable {

    private static final long serialVersionUID = 666730876875452964L;


    private String name;
    private Integer mathScore;

    private Student() {

    }

    private Student(String name, Integer mathScore) {
        this.name = name;
        this.mathScore = mathScore;
    }

    public static Student of(String name, Integer mathScore) {
        return new Student(name, mathScore);
    }
}
