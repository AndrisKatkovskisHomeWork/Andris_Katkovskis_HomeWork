import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HomeWork_1_4 {

    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("\nLietotājs ievada (veselu) skaitļu virkni, piem., '11 2 36.4 4 8.9 7.6 3 256' ");
        String userLine = br.readLine();

        double total = totalOfInts(userLine);
        System.out.println("\nSkaitļu virknes summa ir: " + total);
    }

    static double totalOfInts(String userLine) {
        ArrayList<String> words = wordsFromSentence(userLine);
        double total = 0;
        for (String word : words) {
            double wordValueDouble = Double.parseDouble(word);
            total += wordValueDouble;
        }
        return total;
    }

    static ArrayList<String> wordsFromSentence(String userLine) {
        ArrayList<String> words = new ArrayList<>();
        String currentWord = "";
        for (int i = 0; i < userLine.length(); i++) {
            if (userLine.charAt(i) == ' ') {
                words.add(currentWord);
                currentWord = "";
            } else {
                currentWord += userLine.charAt(i);
                if (i == userLine.length() - 1) {
                    words.add(currentWord);
                }
            }
        }
        return words;
    }
}
