import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Категории
        Category fiction = new Category("Фантастика");
        Category history = new Category("История");

        // Книги
        Book book1 = new Book("Дюна", "Фрэнк Герберт", 1965, fiction);
        Book book2 = new Book("Дюна", "Фрэнк Герберт", 1965, fiction); // Дубликат
        Book book3 = new Book("Война и мир", "Лев Толстой", 1869, history);

        // Создаёт полки
        Stack stack1 = new Stack("Полка №1");
        Stack stack2 = new Stack("Полка №2");

        // Проверяет equals и hashCode
        System.out.println("book1 equals book2: " + book1.equals(book2)); // true
        System.out.println("book1 hashCode == book2 hashCode: " + (book1.hashCode() == book2.hashCode())); // true

        System.out.println("fiction equals history: " + fiction.equals(history)); // false
        System.out.println("stack1 equals stack2: " + stack1.equals(stack2)); // false

        // Выводит количество созданных объектов
        System.out.println("Количество книг: " + Book.getBookCount());
        System.out.println("Количество категорий: " + Category.getCategoryCount());
        System.out.println("Количество полок: " + Stack.getStackCount());
    }
}
