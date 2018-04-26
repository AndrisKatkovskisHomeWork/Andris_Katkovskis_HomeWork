public class ObjectBook {

    public ObjectBook(String authorName, String title) {
        this.authorName = authorName;
        this.title = title;
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


}
