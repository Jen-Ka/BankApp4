package calcs;

import clients.Client;

public class Calculation {

    public void countClient(){
        int startCountClient = 1;
        System.out.println(++startCountClient);

    }

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





}
