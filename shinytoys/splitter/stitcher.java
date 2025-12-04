import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stitcher {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java stitcher <file1> <file2> [<file3> ...]");
            System.exit(1);
        }

        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File("stitched_" + System.currentTimeMillis())))) {
            for (String filename : args) {
                try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(new File(filename)))) {
                    int b;
                    while ((b = inputStream.read()) != -1) {
                        outputStream.write(b);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Oops! There was an error. Check that the filenames are correct.");
            System.exit(2);
        }

        System.out.println("Success! Good bye.");
    }
}
