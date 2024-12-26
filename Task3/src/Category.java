public class Category {
    private String name;

    private static int categoryCount;

    // Статический блок инициализации
    static {
        categoryCount = 0;
    }

    // Блок инициализации экземпляра
    {
        categoryCount++;
    }

    // Конструктор
    public Category(String name) {
        this.name = name;
    }

    // Геттер и сеттер
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Category category = (Category) obj;
        return name.equals(category.name);
    }

    // Переопределение hashCode
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // Метод для получения количества категорий
    public static int getCategoryCount() {
        return categoryCount;
    }
}
