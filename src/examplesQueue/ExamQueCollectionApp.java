package examplesQueue;

import clients.Client;
import services.ServiceClient;
import java.util.List;
import java.util.Random;

public class ExamQueCollectionApp {

    public static void main(String[] args) {

        ServiceClient serviceClient = new ServiceClient();

        Random r = new Random();
        for (int i = 0; i < r.nextInt(10); i++){
           // serviceClient.getNumQueue("Снять деньги", String.valueOf(i));
        }

        //process (serviceClient.getTickets());
    }
    private static void process(List<Client> tickets) {
        while (tickets.size()>0){
            Client client = tickets.get(0);
            System.out.println("Обслужен клиент: " + client);
            tickets.remove(client);
        }

    }

}
