public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other==null||getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return name.equals(book.name) && author.equals(book.author) && yearOfPublication == book.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, yearOfPublication);
    }
}
