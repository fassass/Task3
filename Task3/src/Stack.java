public class Stack {
    private String address;

    private static int stackCount;

    // Статический блок инициализации
    static {
        stackCount = 0;
    }

    // Блок инициализации экземпляра
    {
        stackCount++;
    }

    // Конструктор
    public Stack(String address) {
        this.address = address;
    }

    // Геттер и сеттер
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Переопределение equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Stack stack = (Stack) obj;
        return address.equals(stack.address);
    }

    // Переопределение hashCode
    @Override
    public int hashCode() {
        return address.hashCode();
    }

    // Метод для получения количества полок
    public static int getStackCount() {
        return stackCount;
    }
}