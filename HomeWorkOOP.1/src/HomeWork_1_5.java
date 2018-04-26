public class HomeWork_1_5 {

    public static String concatWithString() {
        String t = "Java";
        for (int i = 0; i < 10000; i++) {
            t = t + "Tpoint";
        }
        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append("Tpoint");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        concatWithString();

        System.out.println("Time taken by Concating:");
        System.out.println(" \t-with String: \t\t\t" + (System.currentTimeMillis() - startTime) + " ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println(" \t-with StringBuffer: \t" + (System.currentTimeMillis() - startTime) + " ms");

        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb2.append("Tpoint");
        }
        System.out.println(" \t-with StringBuilder: \t" + (System.currentTimeMillis() - startTime) + " ms");
    }
}
