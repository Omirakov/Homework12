public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Andrzej", "Sapkowski");
        Book book1 = new Book("The tower of the swallow", author1, 1997);
        System.out.println(book1.getBookName() + " " + book1.getAuthorName() + " " + book1.getPublisherYear());

        Author author2 = new Author("Roger", "Zelazny");
        Book book2 = new Book("The guns of Avalon", author2, 1999);
        System.out.println(book2.getBookName() + " " + book2.getAuthorName() + " " + book2.getPublisherYear());

        book2.setPublisherYear(1972);
        System.out.println(book2.getPublisherYear());
        System.out.println(book2.getBookName() + " " + book2.getAuthorName() + " " + book2.getPublisherYear());
    }


}
