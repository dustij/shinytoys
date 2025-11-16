package util;

/**
 * A listener for receiving notifications when a cell in an {@link ObservableGrid} changes its
 * value.
 *
 * <p>
 * Implementations can be registered on an {@link ObservableGrid} via its {@code addListener}
 * method. Whenever a grid cell is updated, a {@link GridChangeEvent} is fired, carrying the cell's
 * coordinates, old value, and new value.
 * </p>
 *
 * @param <T> the type of values stored in the grid
 * @author Dusti Johnson
 * @see GridChangeEvent
 * @see ObservableGrid
 * @since 1.0
 */
@FunctionalInterface
public interface GridChangeListener<T> {
    void onChange(GridChangeEvent<T> event);
}
