import calcs.Calculation;
import clients.Client;
import constr.Constructions;
//import massivy.MassClients;
import staff.*;

public class myBankApp {

    public static void main(String[] args) {

        
        //Client client = new Client("Иван", "Петров", 14, "1111 234325", false, true, "123456");
        Administrator administrator = new Administrator("Елена", "старший администратор");
        Consultant consultant = new Consultant("Мария", "консультант");
        Manager manager = new Manager("Антон", "менеджер кредитного отдела");
        Cashier cashier = new Cashier("Ольга", "старший кассир");
        Calculation operRaschet = new Calculation();
        Constructions constr = new Constructions();
        //MassClients massClients = new MassClients();
        InterfacePersonal pers = new Cashier("Test", "doljnost");


        //client.speakOut("Добрый день! Я хочу получить консультацию по кредиту и оформить его, дайте талон к консультанту и менеджеру?");

        administrator.greetingClient(); //администратор приветствует клиента

        administrator.getTalon(); // выдаёт талон  менеджеру и консультанту

        operRaschet.takeTalon(); //

        constr.countClients(4);

        //massClients.printArrayClients(); //не сумела передать сюда ничего из класса с массивами

        constr.selectWindow(2, 2);

        //client.speakOut("Мне нужен кредит на ремонт, давайте подберём подходящий?");

        consultant.greetingClient();

        consultant.getInfoAboutCredit();

        constr.giveCredit(19, false, true);

        operRaschet.getCountCredit();

        constr.checkIncome(120000);

        //client.speakOut("Оформите мне, пожалуйста, договор на получение кредита");

        manager.greetingClient();

        manager.getContract();

        //client.speakOut("Я оформил кредит, выдайте мне деньги.");

        cashier.greetingClient();

        cashier.getMoney();

        constr.monthPay(25000, 5000);

        pers.printBalance(456);

    }
}
