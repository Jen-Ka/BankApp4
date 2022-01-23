package staff;

public class Manager extends Personal {

    public Manager(String name, String position) {
        super(name, position);
    }

    public void getContract() {            //получить подписанный договор
        System.out.println("Вот ваш договор. Наличные можно получить в кассе.");
    }
}
