public class HomeWork_1_2 {
    public static void main(String[] args) {

        char[] symbols1 = new char[4];
        symbols1[0] = 'a';
        symbols1[1] = 's';
        symbols1[2] = 'a';


        if (symbols1[0] == symbols1[2]) {
            System.out.println("trīs simbou virkne ir simetriska");
        } else {
            System.out.println("trīs simbou virkne nav simetriska");
        }
        System.out.println("\n");

        char[] symbol2 = new char[4];
        symbol2[0] = 'a';
        symbol2[1] = 's';
        symbol2[2] = 'd';
        symbol2[3] = 'f';

        if (symbols1[0] == symbols1[3] && symbols1[1] == symbols1[2]) {
            System.out.println("četru simbolu virkne ir simetriska");
        } else {
            System.out.println("četru simbou virkne nav simetriska");

        }
    }
}
