package staff;

public class Personal implements InterfacePersonal {

    private String name;    //ФИО
    private String position;    //должность

    @Override
    public void greetingClient() {  //Поприветствовать клиента - 05.05.2022 переопределён из интефейса

        System.out.println("Добрый день! Меня зовут " + getName() + ". Я " + getPosition());


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Personal(String name, String position) {
        this.name = name;
        this.position = position;
    }
}
