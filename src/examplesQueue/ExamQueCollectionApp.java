package examplesQueue;

import clients.Client;
import services.ServiceClient;
import java.util.List;
import java.util.Queue;

public class ExamQueCollectionApp {

    public static void main(String[] args) {

        ServiceClient serviceClient = new ServiceClient();

        int numQueue1 = serviceClient.getNumQueue("Открыть счёт", "222");
        int numQueue2 = serviceClient.getNumQueue("Открыть счёт", "666");
        int numQueue3 = serviceClient.getNumQueue("Открыть счёт", "111");
        int numQueue4 = serviceClient.getNumQueue("Открыть счёт", "999");

        //List<Client> clients = serviceClient.getClients(); // в конечном варианте с удалением клиента этот список нам не нужны, использовались для принтинфо
        //List<Client> tickets = serviceClient.getTickets(); параметр перенесён в вызов метода process
        //Queue<Client> tickets = serviceClient.getTickets(); // попытка настройки через очередь
        //List <Client> ticketToClients = serviceClient.getTicketToClients();

        //printInfoClient(tickets);

        //while (tickets.size()>0) // в конечном варианте не нужен
        process (serviceClient.getTickets());
    }
    private static void process(List<Client> tickets) {
        while (tickets.size()>0){
            Client client = tickets.get(0);
            System.out.println("Клиент: " + client);
            tickets.remove(client);
        }

    }

    /*private static void process(List<Client> tickets) {
        for (Client clientToProcess : tickets){ //возможно падение программы, так как тут может не появиться итератор,
                                                    //а в такой ситуации удаление непозволительно.
            System.out.println("Обработан клиент: " + clientToProcess);

           //tickets.remove(clientToProcess); этот вариант не подходит для удаления из List, т.к. эта функция удаляет откуда попало

        }
    }*/ //переделан под вариант с удалением клиента после обработки см. выше


    /*private static void printInfoClient(List<Client> ticketToClients) {
        for (int i = 0; i< ticketToClients.size(); i++){
            String s = ticketToClients.get(i) != null ? ticketToClients.get(i).toString() : null;
            System.out.println("Номер: " + i + ". Клиент: " + s);
        }
    }*/ //первый вариант настройки - с 3 списками
}
