package staff;

public class Manager extends Personal implements InterfacePersonal{

    public Manager(String name, String position) {
        super(name, position);
    }

    public void getContract() {            //получить подписанный договор
        System.out.println("Вот ваш договор. Наличные можно получить в кассе.");
    }

}
