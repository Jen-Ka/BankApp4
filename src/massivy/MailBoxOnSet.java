package massivy;

import clients.Client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class MailBoxOnSet implements MailBoxClients{

    private Collection<Client> clients = new HashSet<>();

    @Override
    public void addClient(Client client) {
        clients.add(client);

    }

    @Override
    public Object[] getClients() {
        return clients.toArray();
    }
}
