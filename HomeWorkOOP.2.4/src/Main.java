public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Robert C. Martin", "Clean Code", 2008, 432);
        System.out.println("Book 1: " + book1.getAuthorName() + book1.getTitle()
                + ", " + book1.getGraduationYear() + ", " + book1.getNumberOfPages());

        Book book2 = new Book("Steve McConnell", "Code Complete", 2004, 914);
        System.out.println("Book 2: " + book2.getAuthorName() + book2.getTitle()
                + ", " + book2.getGraduationYear() + ", " + book2.getNumberOfPages());

        Book book3 = new Book("Andrew Hunt", "The Pragmatic Programmer", 1999, 321);
        System.out.println("Book 3: " + book3.getAuthorName() + book3.getTitle()
                + ", " + book3.getGraduationYear() + ", " + book3.getNumberOfPages());

    }
}