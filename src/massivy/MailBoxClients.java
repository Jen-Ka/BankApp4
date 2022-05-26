package massivy;

import clients.Client;

public interface MailBoxClients {

        void addClient(Client client);
        Object[] getClients(); // т.к. возвращается Object, то вместо Client[] getClients(); вписываем то, что есть



}
