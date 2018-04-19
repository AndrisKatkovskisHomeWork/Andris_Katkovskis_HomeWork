public class main {
    public static void main(String[] args) {

        Book book1 = new Book();
        System.out.println("Book 1:");

        book1.setAuthorName("Robert C. Martin");
        book1.setTitle("Clean Code");
        book1.setGraduationYear(2008);
        book1.setNumberOfPages(432);
        System.out.println("Autors: \t\t" + book1.getAuthorName());
        System.out.println("Nosaukums:\t\t" + book1.getTitle());
        System.out.println("Izlaiduma gads:\t" + book1.getGraduationYear());
        System.out.println("Lapu skaits:\t" + book1.getNumberOfPages());


        Book book2 = new Book();
        System.out.println("\nBook2:");

        book2.setAuthorName("Steve McConnell");
        book2.setTitle("Code Complete");
        book2.setGraduationYear(2004);
        book2.setNumberOfPages(914);
        System.out.println("Autors: \t\t" + book2.getAuthorName());
        System.out.println("Nosaukums:\t\t" + book2.getTitle());
        System.out.println("Izlaiduma gads:\t" + book2.getGraduationYear());
        System.out.println("Lapu skaits:\t" + book2.getNumberOfPages());


        Book book3 = new Book();
        System.out.println("\nBook2:");

        book3.setAuthorName("Andrew Hunt");
        book3.setTitle("The Pragmatic Programmer");
        book3.setGraduationYear(1999);
        book3.setNumberOfPages(321);
        System.out.println("Autors: \t\t" + book3.getAuthorName());
        System.out.println("Nosaukums:\t\t" + book3.getTitle());
        System.out.println("Izlaiduma gads:\t" + book3.getGraduationYear());
        System.out.println("Lapu skaits:\t" + book3.getNumberOfPages());

    }
}