package staff;

public class Personal {

    private String name;    //ФИО
    private String position;    //должность

    public Personal greetingClient() {  //Поприветствовать клиента
        return null;
    }
    {
        System.out.println("Добрый день! Меня зовут " + name + ". Я " + position);
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
