package staff;

public class Cashier extends Personal implements InterfacePersonal{

    public Cashier(String name, String position) {
        super(name, position);
    }

    public void getMoney() {//получить у кассира наличные
        System.out.println("Вот ваши деньги, приходите ещё!");
    }

    @Override //переопределённый метод из интерфейса - именно он выводится на печать после добавления, а не метод по умолчанию.
    public void printBalance(int sum) {
        System.out.println("Печать баланса из класса Кассир: " + sum);
    }
}
