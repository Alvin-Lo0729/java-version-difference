package idv.alvin.jep213;

/**
 * @author Alvin
 */
public abstract class Handler<T> {
    public T content;

    public Handler(T content) {

        this.content = content;
    }

    abstract void handle();
}
