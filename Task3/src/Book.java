public class Book {
    private String name;
    private String author;
    private int year;
    private Category category;

    private static int bookCount;

    // Статический блок инициализации
    static {
        bookCount = 0;
    }

    // Блок инициализации экземпляра
    {
        bookCount++;
    }

    // Конструктор
    public Book(String name, String author, int year, Category category) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;

        return year == book.year &&
                name.equals(book.name) &&
                author.equals(book.author) &&
                category.equals(book.category);
    }

    // Переопределение hashCode
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + Integer.hashCode(year);
        result = 31 * result + category.hashCode();
        return result;
    }

    // Метод для получения количества книг
    public static int getBookCount() {
        return bookCount;
    }
}
