package staff;

public class Cashier extends Personal {

    public Cashier(String name, String position) {
        super(name, position);
    }

    public void getMoney() {//получить у кассира наличные
        System.out.println("Вот ваши деньги, приходите ещё!");
    }
}
