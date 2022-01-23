import clients.Client;
import staff.Administrator;
import staff.Cashier;
import staff.Consultant;
import staff.Manager;

public class myBankApp {

    public static void main(String[] args) {
        Client client = new Client("Иван", "Петров", 35, "1111 234325");

        client.giveMeTalon();
        client.giveMeInfoAboutCredit();
        client.giveMeContract();
        client.giveMeMoney();

        Administrator administrator = new Administrator("Елена", "старший администратор");

        administrator.greetingClient();
        administrator.getTalon();

        Consultant consultant = new Consultant("Мария", "консультант");

        consultant.greetingClient();
        consultant.getInfoAboutCredit();

        Manager manager = new Manager("Антон", "менеджер кредитного отдела");

        manager.greetingClient();
        manager.getContract();

        Cashier cashier = new Cashier("Ольга", "старший кассир");

        cashier.greetingClient();
        cashier.getMoney();



    }
}
