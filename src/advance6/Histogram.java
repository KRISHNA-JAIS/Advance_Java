package advance6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Histogram {
    public static void main(String[] args) throws IOException {
        //Write a program that reads a list of exam scores from the file MidtermScores.txt (which contains one score
        // per line) and then displays a histogram of those numbers, divided into the ranges 0–9, 10–19, 20–29, and
        // so forth, up to the range containing
        // only the value 100.
        initHistogram();
        readScoresIntoHistogram();
        printHistogram();
    }
    /* Initializes the histogram array */
    private static void initHistogram() {
        histogramArray = new int[11];
        for (int i = 0; i <= 10; i++) {
            histogramArray[i] = 0;
        }
    }
    private static void readScoresIntoHistogram() {
        try {
            BufferedReader rd
                    = new BufferedReader(new FileReader("src/MidtermScores.txt "));
            while (true) {
                String line = rd.readLine();
                if (line == null) break;
                int score = Integer.parseInt(line);
                if (score < 0 || score > 100) {
                    System.out.println("That score is out of range");
                } else {
                    int range = score / 10;
                    histogramArray[range]++;
                }
            }
        } catch (IOException ex) {
            System.out.println("Exception Occurs");
        }
    }
    /* Displays the histogram */
    private static void printHistogram() {
        for (int range = 0; range <= 10; range++) {
            String label;
            switch (range) {
                case 0: label = "00-09"; break;
                case 10: label = " 100"; break;
                default:
                    label = (10 * range) + "-" + (10 * range + 9);
                    break;
            }
            String stars = createStars(histogramArray[range]);
            System.out.println(label + ": " + stars);
        }
    }
    /* Creates a string consisting of n stars */
    private static String createStars(int n) {
        String stars = "";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }
        return stars;
    }
    /* Private instance variables */
    private static int[] histogramArray;
    /* Name of the data file */
    private static final String DATA_FILE = "MidtermScores.txt";
}