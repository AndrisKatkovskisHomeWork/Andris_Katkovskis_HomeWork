import java.io.*;

public class HomeWork_1_1 {
    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Lūdzu ievadīt pirmo simbolu virkni");
        String str1 = br.readLine();
        System.out.println("\nLūdzu ievadīt otro simbolu virkni");
        String str2 = br.readLine();
        System.out.println("\nKonkatinācija: " + str1 + str2);
    }
}