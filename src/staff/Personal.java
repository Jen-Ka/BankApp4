package staff;

public class Personal {

    private String name;    //ФИО
    private String position;    //должность

    public void greetingClient() {  //Поприветствовать клиента

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
