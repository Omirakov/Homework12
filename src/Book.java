public class Book {
    private String bookName;
    private Author authorName;
    private int publisherYear;


    Book(String bookName, Author Author, int publisherYear) {
        this.bookName = bookName;
        this.authorName = Author;
        this.publisherYear = publisherYear;
    }


    public String getBookName() {
        return bookName;
    }


    public Author getAuthorName() {
        return authorName;
    }


    public int getPublisherYear() {
        return publisherYear;
    }


    public void setPublisherYear(int publisherYear) {
        if (publisherYear <= 2025 && publisherYear >= 1800) {
            this.publisherYear = publisherYear;
        } else {
            throw new IllegalArgumentException("Год издания не может быть меньше 1800 и больше 2025");
        }
    }


}
