package idv.alvin.record;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Alvin
 */
@EqualsAndHashCode
@ToString
@Data
public class Book {
    private final String title;
    private final String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {


        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


}
