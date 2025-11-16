package observable_grid;

/**
 * Simple test driver for ObservableGrid.
 *
 * Demonstrates basic functionality including:
 * - Creating a grid
 * - Adding listeners
 * - Setting values and triggering change events
 *
 * @author Dusti Johnson
 */
public class TestDriver {
    public static void main(String[] args) {
        System.out.println("ObservableGrid Test Driver");
        System.out.println("=========================\n");

        // Create a 3x3 grid of Integers
        ObservableGrid<Integer> grid = new ObservableGrid<>(3, 3);

        // Add a listener that prints change events
        grid.addListener(event -> {
            System.out.printf("Change detected at [%d,%d]: %s -> %s%n",
                event.getRow(),
                event.getCol(),
                event.getOldValue(),
                event.getNewValue());
        });

        System.out.println("Grid size: " + grid.rowSize() + "x" + grid.colSize());
        System.out.println("\nSetting values...\n");

        // Set some values
        grid.setValue(1, 0, 0);
        grid.setValue(2, 0, 1);
        grid.setValue(3, 0, 2);
        grid.setValue(4, 1, 0);
        grid.setValue(5, 1, 1);
        grid.setValue(6, 1, 2);
        grid.setValue(7, 2, 0);
        grid.setValue(8, 2, 1);
        grid.setValue(9, 2, 2);

        // Update an existing value
        System.out.println("\nUpdating existing value...\n");
        grid.setValue(99, 1, 1);

        // Display final grid state
        System.out.println("\nFinal grid state:");
        for (int i = 0; i < grid.rowSize(); i++) {
            for (int j = 0; j < grid.colSize(); j++) {
                System.out.printf("%3d ", grid.getValue(i, j));
            }
            System.out.println();
        }

        System.out.println("\nTest completed successfully!");
    }
}
