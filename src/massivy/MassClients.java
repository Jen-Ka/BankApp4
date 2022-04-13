package massivy;

import clients.Client;

public class MassClients {
    public static void main(String[] args) {
        /*Client[] arrayClients = {new Client("Петров","Пётр",45,"123456",true,false),
                new Client("Петров","Иван",23,"56789",false,false)};
        for (Client client : arrayClients) {         //foreach
            System.out.println(client.toString());
        }
        System.out.println(arrayClients.length);*/

        Client[] arrayClients = new Client[5];
        arrayClients[0] = new Client("Петров", "Пётр", 45, "12311456", false, false);
        arrayClients[1] = new Client("Иванов", "Иван", 18, "12322456", true, true);
        arrayClients[2] = new Client("Сидоров", "Сергей", 16, "12344456", false, false);
        arrayClients[3] = new Client("Кузнецов", "Константин", 88, "12355456", false, true);
        arrayClients[4] = new Client("Юрьев", "Игорь", 43, "12377456", false, true);

        printArrayClients(arrayClients);
        System.out.println("______________");
        selectClientForCredit(arrayClients);


    }

    // использование цикла for в работе с массивами
    public static void printArrayClients(Client[] arrayClients) { // печать списка клиентов

        for (int i = 0; i < arrayClients.length; i++) {
            System.out.println(arrayClients[i]);
            }
    }

    //использование foreach в работе с массивом
    public static void selectClientForCredit(Client[] arrayClients) { // подбор клиента, который подходит для одобрения кредита

        for (Client client : arrayClients) {
            if (client.getAge() > 18 && (client.isHasRealty() && !client.isHasCredit())) {
                System.out.println(client.getFirstName() + ", а вы молодец, вам можно одобрить кредит!");
            } else {
                System.out.println(client.getFirstName() + ", вам кредита не положено");
            }
        }
    }
}

// фантазии не хватает придумать, что можно сделать с циклами do while и while в этом разделе
    /*do {
            System.out.println(arrayClients.toString() + "не можем вам ничем помочь, увы:(");
        }
        while ();

// фантазии не хватает придумать, что можно сделать с циклами do while и while в этом разделе
        while ();*/


