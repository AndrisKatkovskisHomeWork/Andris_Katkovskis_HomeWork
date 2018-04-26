public class Book extends ObjectBook {

    public Book(String authorName, String title, int graduationYear, int numberOfPages) {
        super(authorName, title);
        this.graduationYear = graduationYear;
        this.numberOfPages = numberOfPages;

    }

    private int graduationYear;

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYearEntered) {
        this.graduationYear = graduationYearEntered;
    }


    private int numberOfPages;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPagesEntered) {
        this.numberOfPages = numberOfPagesEntered;
    }
}