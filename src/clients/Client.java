package clients;

public class Client {
    private String clientId;    // внутренний id клиента
    private String fio;         //фио клиента
    private int age;            //возраст

    public Client(String clientId, String fio, int age) {
        this.clientId = clientId;
        this.fio = fio;
        this.age = age;

    }

    public Client() {

    }

    public String getClientId() {
        return clientId;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Клиент: Id: " + clientId + ", ФИО " + fio + ", возраст " + age + " лет ";
    }
}
