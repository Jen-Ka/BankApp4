package massivy;

import clients.Client;

public class MailBoxOnArray implements MailBoxClients {

    private int mailBoxIndex;

    private int regenArrayIndex;

    private Client[] clients = new Client[10];

    public void addClient(Client client) {
        if(regenArrayIndex >= 10){
            Client[] clients2 = new Client[clients.length+10];
            System.arraycopy(clients, 0, clients2, 0, clients.length);
            clients = clients2;
            regenArrayIndex = 0;
        }
        clients[mailBoxIndex++] = client;
        regenArrayIndex++;

    }
    public Client[] getClients() {
        return clients;
    }
}

