public class Book {
    private Author authorName;
    private String bookName;
    private int publishingYear;

    public Book(Author authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;

    }

    public Author getAuthorName() {

        return authorName;
    }

    public String getBookName() {

        return bookName;
    }

    @Override
    public String toString() {
        return "Книга " + this.getBookName() + " Автор " + this.getAuthorName() + " Год " + publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }
}