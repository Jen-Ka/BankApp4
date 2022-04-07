package constr;

import clients.Client;

public class Constructions {

    public void giveCredit(int age, boolean clientHasCredit, boolean clientHasRealty) {      // Пример конструкции if-else для ДЗ 6. 16.02.2022 - проверка возможности выдачи кредита по условиям
        if (age > 18 && !clientHasCredit && clientHasRealty) {
        //if (client.getAge() > 18 && !client.isHasCredit() && client.isHasRealty()) {
            System.out.println("Кредит вам одобрен, будем оформлять?");
        } else {
            System.out.println("Увы, кредит не одобрен");
        }
    }
    public void checkIncome(int yearSalary) {           // Пример конструкции if для ДЗ 6. 16.02.2022 - типа "расчёт ежемес. дохода"

        if ((yearSalary/12)<90000){
            System.out.println("Маловато у вас денежек, не хватит на кредит, не дадим!:)");
        }
    }

    public void monthPay(int sumCredit, int monthSum){          // Пример конструкции while для ДЗ 6. 18.02.2022 - расчёт остатка по кредиту

        while (sumCredit>0) {
            sumCredit =sumCredit-monthSum;
            System.out.println("Вам осталось выплатить "+sumCredit);
        }

    }

    public void countClients(int clientCount) {// Пример конструкции do-while для ДЗ 6. 18.02.2022 - расчёт количества человек в очереди

        do {
            clientCount--;
            System.out.println("Перед вами в очереди " + clientCount + " клиентов");
        }
        while (clientCount>1);
        System.out.println("Ваша очередь подошла, пройдите к окну");

    }

    public void selectWindow(int zal, int window) { // пример конструкции for для ДЗ 6. 18.02.2022 - определение свободного окна оператора банка
        //for (int i = 1; i < 5; i++) {
        //    System.out.println("Вы можете пройти к окну № "+ i);
        //}
        for (zal = 1; zal <= 2; zal++) {
            for (window = 1; window <= 3; window++) {
                System.out.println("Вы можете пройти в зал № " + zal + ", к окну № " + window);
            }
        }

    }
}
