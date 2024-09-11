public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");

        Book book1 = new Book("Война и мир", author1, 1867);

        Author author2 = new Author("Фёдор", "Достоевский");

        Book book2 = new Book("Преступление и наказание", author2, 1866);

        book1.setYearOfPublication(1868);
        System.out.println(book1.getYearOfPublication());
    }

}