package util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ObservableGrid<T> {
    private final T[][] grid;
    private final List<GridChangeListener<T>> listeners;

    @SuppressWarnings("unchecked")
    public ObservableGrid() {
        grid = (T[][]) new Object[0][0];
        listeners = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    public ObservableGrid(int rows, int cols) {
        grid = (T[][]) new Object[rows][cols];
        listeners = new ArrayList<>();
    }

    public ObservableGrid(Supplier<T[][]> arraySupplier) {
        grid = arraySupplier.get();
        listeners = new ArrayList<>();
    }

    public T getValue(int row, int col) {
        return grid[row][col];
    }

    public void setValue(T newValue, int row, int col) {
        T oldValue = grid[row][col];
        grid[row][col] = newValue;
        notifyListeners(new GridChangeEvent<>(oldValue, newValue, row, col));
    }

    public void addListener(GridChangeListener<T> listener) {
        listeners.add(listener);
    }

    public void removeListener(GridChangeListener<T> listener) {
        listeners.remove(listener);
    }

    private void notifyListeners(GridChangeEvent<T> event) {
        for (GridChangeListener<T> listener : listeners) {
            listener.onChange(event);
        }
    }

    public int rowSize() {
        return grid.length;
    }

    public int colSize() {
        return grid[0].length;
    }
}
