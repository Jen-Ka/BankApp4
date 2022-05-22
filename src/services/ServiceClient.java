package services;

import clients.Client;
import clients.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
// хранить номерки в очереди с привязкой к клиенту (List/Array с доп.функционалом для удаления отработанного)

// хранить клиентов (аналог базы клиентов) - можно использовать List, но с доп.обработкой для исключения дублей

// использовать комбинированный способ через доп.класс

public class ServiceClient {

    private final Client CLIENT_1 = new Client("Петров", "Пётр", 45, "12311456", false, false, "1");
    private final Client CLIENT_2 = new Client("Иванов", "Иван", 18, "12322456", true, true, "2");
    private final Client CLIENT_3 = new Client("Сидоров", "Сергей", 16, "12344456", false, false, "3");
    private final Client CLIENT_4 = new Client("Кузнецов", "Константин", 88, "12355456", false, true, "4");
    private final Client CLIENT_5 = new Client("Юрьев", "Игорь", 43, "12377456", false, true, "5");

    private List<Client> clients = List.of(CLIENT_1, CLIENT_2, CLIENT_3, CLIENT_4, CLIENT_5);
    private List<Client> tickets = new ArrayList<>(); //вариант с List
    //private Queue<Client> tickets = new PriorityQueue<>(); // вариант с Queue
    //private List <Client> ticketToClients = new ArrayList<>(); //при упрощении уода этот список не нужен, всё сделано через tickets

    public int getNumQueue(String uslugaType, String clientId) {
        int newNumTik = tickets.size();
        //tickets.add(newNumTik);
        //tickets.add(newNumTik, getClientById(clientId));
        tickets.add(getClientById(clientId)); // вариант настройки по одному параметру
        //return newNumTik;
        return tickets.size(); // вариант настройки по одному параметру
    }

    private Client getClientById(String clientId) {
        for (Client currentClient : clients) {
            if (currentClient != null && currentClient.getClientId().equals(clientId)) {
                return currentClient;
            }
        }
        return null;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Client> getTickets() {
        return tickets;
    }

    //public List<Client> getTicketToClients() {
    //return ticketToClients;
    //}
}

