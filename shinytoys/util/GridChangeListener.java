package util;

@FunctionalInterface
public interface GridChangeListener<T> {
    void onChange(GridChangeEvent<T> event);
}
