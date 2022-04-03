package ds;

public class Holder<T> {
    T object;

    public Holder(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public boolean isNull() {
        return object == null;
    }

    public void setObject(T object) {
        this.object = object;
    }
}