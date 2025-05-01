package util;

/**
 * Encapsulates a change to a single cell in an {@link ObservableGrid}.
 *
 * <p>
 * Holds the previous and updated values along with the cell's zero-based row and column indices.
 * Listeners receive this event whenever a grid cell is updated.
 * </p>
 *
 * @param <T> the type of values stored in the grid
 * @author Dusti Johnson
 * @see ObservableGrid
 * @see GridChangeListener
 * @since 1.0
 */
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
