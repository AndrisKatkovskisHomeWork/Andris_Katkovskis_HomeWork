public class HomeWork_1_3 {

    public static void main(String[] args) {
        String passcode = HomeWork_1_3.encrypt("Virkni tagad var izlasīt");

        System.out.println("\nKodēta virkne:\n" + HomeWork_1_3.encrypt(passcode));
        System.out.println("\nAtšifrēta virkne:\n" + HomeWork_1_3.decrypt(passcode));
    }

    public static String encrypt(String key) {
        String result = " ";
        int l = key.length();
        char ch;
        for (int i = 0; i < l; i++) {
            ch = key.charAt(i);
            ch += 10;
            result += ch;
        }
        return result;
    }

    public static String decrypt(String key) {
        String result = " ";
        int l = key.length();
        char ch;
        for (int i = 0; i < l; i++) {
            ch = key.charAt(i);
            ch -= 10;
            result += ch;
        }

        return result;
    }
}
