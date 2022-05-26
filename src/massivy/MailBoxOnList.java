package massivy;

import clients.Client;

import java.util.ArrayList;
import java.util.Collection;

public class MailBoxOnList implements MailBoxClients{

    private Collection<Client> clients = new ArrayList<>();

    @Override
    public void addClient(Client client) {
        clients.add(client);

    }

    @Override
    public Object[] getClients() {
        return clients.toArray();
    }// т.к. в main поменяли на Object, то здесь тоже надо вместо см.ниже - использовать Object
    // public Client[] getClients() {
    // return (Client[]) clients.toArray();
}
