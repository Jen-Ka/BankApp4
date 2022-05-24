package staff;

public interface InterfacePersonal { // интерфейс для ДЗ 15 _ 05.05.2022
    void greetingClient();

    default void printBalance(int sum) { // метод по умолчанию в интерфейсе для ДЗ 15 _ 05.05.2022
        System.out.println("Остаток по вашему счёту: " + sum);
    }
}