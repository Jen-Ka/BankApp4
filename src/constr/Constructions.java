package constr;

import clients.Client;

public class Constructions {

    public void giveCredit(Client client) { // Пример конструкции if-else для ДЗ 6. 16.02.2022 - проверка возможности выдачи кредита по условиям
        //Client client = new Client("Иван", "Петров", 14, "1111 234325", false, true);
        if (client.getAge() > 18 && !client.isHasCredit() && client.isHasRealty()) {
            System.out.println("Кредит вам одобрен, будем оформлять?");
        } else {
            System.out.println("Увы, кредит не одобрен");
        }


    }
    public void checkIncome(Client client) {// Пример конструкции if для ДЗ 6. 16.02.2022 - типа "расчёт ежемес. дохода"
        int monthSalary = 1000000/12;
        if (monthSalary<90000){
            System.out.println("Маловато у вас денежек, не хватит на кредит, не дадим!:)");
        }
    }

    public void monthPay(Client client){// Пример конструкции while для ДЗ 6. 18.02.2022 - расчёт остатка по кредиту
        int a = 25000;
        int b = 5000;

        while (a>0) {
            a =a-b;
            System.out.println("Вам осталось выплатить "+a);
        }

    }

    public void countClients(Client client) {// Пример конструкции do-while для ДЗ 6. 18.02.2022 - расчёт количества человек в очереди
        int quantity = 10;
        do {
            quantity--;
            System.out.println("Перед вами в очереди " + quantity + " клиентов");
        }
        while (quantity>0);

    }

    public void selectWindow(Client client) { // пример конструкции for для ДЗ 6. 18.02.2022 - определение свободного окна оператора банка
        //for (int i = 1; i < 5; i++) {
        //    System.out.println("Вы можете пройти к окну № "+ i);
        //}
        for (int i = 1; i <= 5; i++) {
            for (int r = 1; r <= 4; r++) {
                System.out.println("Вы можете пройти в зал № " + i + ", к окну № " + r);
            }
        }

    }
}
