package calcs;

import clients.Client;

public class Calculation {

    public void takeTalon() {// Операции для ДЗ 5. 09.02.2022
        int talon = 123;
        int t = talon;
        t = t - 10;
        System.out.println("Ваш номер в очереди: "+t);
    }

    public void getCountCredit() {       //Операции для ДЗ 5. 09.02.2022
        int credit = 1500;
        int perceint = 10;
        int fullcoast = (credit*100)/perceint;
        int srok = 12;
        double payment = credit/srok;
        System.out.println("Полная стоимость кредита будет " + fullcoast);
        System.out.println("Ежемесячный платёж составит " + payment);
    }

    public void giveCredit() {
        Client client = new Client("Иван", "Петров", 14, "1111 234325", false, true);
        if (client.getAge()>18 && client.isHasCredit()==false && client.isHasRealty()==true){
            System.out.println("Кредит вам одобрен, будем оформлять?");
        }
        else {
            System.out.println("Увы, кредит не одобрен");
        }



    }


}
