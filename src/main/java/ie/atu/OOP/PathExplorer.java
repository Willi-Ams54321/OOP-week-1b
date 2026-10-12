package ie.atu.OOP;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathExplorer
{
    public static void main(String[]arg)
    {
        Path file = Path.of("data","books.csv");

        System.out.println("Path: " + file);
        System.out.println("file name: " + file.getFileName());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Absolute path: " + file.toAbsolutePath());
        System.out.println("Exists: " + Files.exists(file));
    }
}
