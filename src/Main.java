public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");
        Book book = new Book(pushkin, "Русалка", 1832);
        Book book1 = new Book(tolstoy, "Война и мир", 1832);
        System.out.println(book);
        System.out.println();
        System.out.println(book1);
        System.out.println(book.equals(book1));
        book.setPublishingYear(1937);
        System.out.println(book);


    }

}