package util;

public class GridChangeEvent<T> {
    private final T oldValue;
    private final T newValue;
    private final int row;
    private final int col;

    public GridChangeEvent() {
        oldValue = null;
        newValue = null;
        row = -1;
        col = -1;
    }

    public GridChangeEvent(T oldValue, T newValue, int row, int col) {
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.row = row;
        this.col = col;
    }

    public T getOldValue() {
        return oldValue;
    }

    public T getNewValue() {
        return newValue;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }


}
