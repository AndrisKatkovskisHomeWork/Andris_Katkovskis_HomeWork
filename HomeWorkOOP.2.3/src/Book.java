public class Book {
    public Book(String authorName, String title, int graduationYear, int numberOfPages) {
        this.authorName = authorName;
        this.title = title;
        this.graduationYear = graduationYear;
        this.numberOfPages = numberOfPages;
    }

    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorNameEntered) {
        this.authorName = authorNameEntered;
    }


    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String titleEntered) {
        this.title = titleEntered;
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