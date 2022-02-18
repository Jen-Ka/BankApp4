import calcs.Calculation;
import clients.Client;
import constr.Constructions;
import staff.Administrator;
import staff.Cashier;
import staff.Consultant;
import staff.Manager;

public class myBankApp {

    public static void main(String[] args) {

        
        Client client = new Client("Иван", "Петров", 14, "1111 234325", false, true);
        Administrator administrator = new Administrator("Елена", "старший администратор");
        Consultant consultant = new Consultant("Мария", "консультант");
        Manager manager = new Manager("Антон", "менеджер кредитного отдела");
        Cashier cashier = new Cashier("Ольга", "старший кассир");
        Calculation operRaschet = new Calculation();
        Constructions constr = new Constructions();



        client.giveMeTalon();

        administrator.greetingClient();

        administrator.getTalon();

        operRaschet.takeTalon();

        constr.countClients();

        constr.selectWindow();

        client.giveMeInfoAboutCredit();

        consultant.greetingClient();

        consultant.getInfoAboutCredit();

        constr.giveCredit();

        operRaschet.getCountCredit();

        constr.checkIncome();

        constr.monthPay();

        client.giveMeContract();

        manager.greetingClient();

        manager.getContract();

        client.giveMeMoney();

        cashier.greetingClient();

        cashier.getMoney();



    }
}
