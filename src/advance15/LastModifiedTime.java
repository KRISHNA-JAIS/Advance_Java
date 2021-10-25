package advance15;

import java.io.File;
import java.util.Date;

public class LastModifiedTime {
    public static void main(String[] args) {
        File file = new File("src/sample.txt");
        Date date = new Date(file.lastModified());
        System.out.println("\nThe sample.ext file was last modified on: " + date + "\n");
    }
}