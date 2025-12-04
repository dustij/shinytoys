import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class splitter {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java splitter <sourceFile> <numberOfPieces>");
            System.exit(1);
        }

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(new File(args[0])))) {
            int numberOfPieces = Integer.parseInt(args[1]);
            File sourceFile = new File(args[0]);
            long size = sourceFile.length();

            long bytesPerPiece = size / numberOfPieces;
            long remainder = size % numberOfPieces;

            for (int piece = 0; piece < numberOfPieces; piece++) {
                try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(sourceFile + "." + (piece + 1))))) {
                    for (int byteNumber = 0; byteNumber < bytesPerPiece; byteNumber++) {
                        outputStream.write(inputStream.read());
                        if (piece + 1 == numberOfPieces) {
                            // Write the rest to the last file
                            for (int byteInRemainder = 0; byteInRemainder < remainder; byteInRemainder++) {
                                outputStream.write(inputStream.read());
                            }
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Hmm... There was an error while writing output.");
                    System.exit(4);
                }
            }
        } catch (IOException e) {
            System.err.println("Oops! There was an error. Check that the source filename is correct.");
            System.exit(2);
        } catch (NumberFormatException e) {
            System.err.println("Oops! There was an error. Unable to format integer.");
            System.exit(3);
        }

        System.out.println("Success! Good bye.");
    }
}
