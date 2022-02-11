import calcs.Calculation;
import clients.Client;
import staff.Administrator;
import staff.Cashier;
import staff.Consultant;
import staff.Manager;

public class myBankApp {

    public static void main(String[] args) {
        Client client = new Client("Иван", "Петров", 14, "1111 234325", false, true);
        Administrator administrator = new Administrator("Елена", "старший администратор");
        Calculation operRaschet = new Calculation();
        Consultant consultant = new Consultant("Мария", "консультант");



        client.giveMeTalon();

        administrator.greetingClient();

        administrator.getTalon();

        operRaschet.takeTalon();

        client.giveMeInfoAboutCredit();

        consultant.greetingClient();

        consultant.getInfoAboutCredit();

        operRaschet.giveCredit();

        operRaschet.getCountCredit();
        client.giveMeContract();

        Manager manager = new Manager("Антон", "менеджер кредитного отдела");

        manager.greetingClient();
        manager.getContract();
        client.giveMeMoney();

        Cashier cashier = new Cashier("Ольга", "старший кассир");

        cashier.greetingClient();
        cashier.getMoney();



    }
}
