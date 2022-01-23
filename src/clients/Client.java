package clients;

public class Client {
    private String firstName;//имя клиента
    private String lastName;//фамилия клиента
    private int age;//возраст
    private String pasport;//документ, удостоверяющий личность

    public Client giveMeTalon() {    //заказать у Администратора талоны к консультанту и менеджеру
        return null;
    }
    static {//static добавлен по требованию компилятора (говорит, Warning:(12, 6) Class initializer may be 'static')
        System.out.println("Добрый день! Я хочу получить консультацию по кредиту и оформить его, дайте талон к консультанту и менеджеру?");
    }
    public Client giveMeInfoAboutCredit() {//Попросить рассказать о кредитных продуктах и подобрать подходящий
        return null;
    }
    static {//static добавлен по требованию компилятора (говорит, Warning:(12, 6) Class initializer may be 'static')
        System.out.println("Мне нужен кредит на ремонт, давайте подберём подходящий?");
    }

    public Client giveMeContract() {//оформить договор на получение кредита
        return null;
    }
    static {//static добавлен по требованию компилятора (говорит, Warning:(12, 6) Class initializer may be 'static')
        System.out.println("Оформите мне, пожалуйста, договор на получение кредита");
    }
    public Client giveMeMoney() {//подать заявку на получение наличных в кассе
        return null;
    }
    static {//static добавлен по требованию компилятора (говорит, Warning:(12, 6) Class initializer may be 'static')
        System.out.println("Я оформил кредит, выдайте мне деньги.");
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
    public Client(String firstName, String lastName, int age, String pasport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pasport = pasport;
    }
}
