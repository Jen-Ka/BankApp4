package clients;

public class Client {
    private String firstName;//имя клиента
    private String lastName;//фамилия клиента
    private int age;        //возраст
    private String pasport;//документ, удостоверяющий личность
    private boolean hasCredit;// наличие кредита
    private boolean hasRealty; // наличие недвижимости
    private String clientId;   // внутренний id клиента

    public Client(String firstName, String lastName, int age, String pasport, boolean hasCredit, boolean hasRealty, String clientId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pasport = pasport;
        this.hasCredit = hasCredit;
        this.hasRealty = hasRealty;
        this.clientId = clientId;

    }

    public String getClientId() {
        return clientId;
    }

    public boolean isHasCredit() {
        return hasCredit;
    }

    public void setHasCredit(boolean hasCredit) {
        this.hasCredit = hasCredit;
    }

    public boolean isHasRealty() {
        return hasRealty;
    }

    public void setHasRealty(boolean hasRealty) {
        this.hasRealty = hasRealty;
    }


    public void speakOut(String s) {    //поговорить с сотрудниками о разном (в "s" в main  просто пишем нужные слова в каждый момент времени)
        System.out.println(s);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPasport() {
        return pasport;
    }
    public void setPasport(String pasport) {
        this.pasport = pasport;
    }

    @Override
    public String toString() {
        return "Клиент " + firstName + " " + lastName + ", возраст " + age + " лет, паспорт "
                + pasport + ", наличие кредита: " + hasCredit + ", наличие недвижимости: " + hasRealty + ", id: " + clientId;
    }
}
