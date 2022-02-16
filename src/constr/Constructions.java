package constr;

import clients.Client;

public class Constructions {

    public void giveCredit() { // Пример конструкции if-else для ДЗ 6. 09-16.02.2022
        Client client = new Client("Иван", "Петров", 14, "1111 234325", false, true);
        if (client.getAge() > 18 && !client.isHasCredit() && client.isHasRealty()) {
            System.out.println("Кредит вам одобрен, будем оформлять?");
        } else {
            System.out.println("Увы, кредит не одобрен");
        }


    }
    public void checkIncome() {// Пример конструкции if для ДЗ 6. 09-16.02.2022
        int monthSalary = 1000000/12;
        if (monthSalary<90000){
            System.out.println("Маловато у вас денежек, не хватит на кредит, не дадим!:)");
        }
    }
}
