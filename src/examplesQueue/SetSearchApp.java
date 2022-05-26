package examplesQueue;

import clients.BaseClient;
import clients.Client;
import clients.VipClient;
import massivy.MailBoxClients;
import massivy.MailBoxOnArray;
import massivy.MailBoxOnList;
import massivy.MailBoxOnSet;
import services.ServiceClient;
import java.util.Random;

public class SetSearchApp {


    public static void main(String[] args) {

        ServiceClient s = new ServiceClient();

        //MailBoxOnArray myMailBox = new MailBoxOnArray(); // первый вариант с массивом
        //MailBoxClients myMailBox = new MailBoxOnArray(); // второй вариант через интерфейс+массив
        //MailBoxClients myMailBox = new MailBoxOnList(); // третий вариант через List
        MailBoxClients myMailBox = new MailBoxOnSet();

        for (int i = 0; i < 100; i++) {

            //Client vipclient = new VipClient();
            //Client vipclient = selectAnyClient();
            myMailBox.addClient(selectAnyClient());

            //Client baseclient = new BaseClient();
            //myMailBox.addClient(baseclient);
        }

        for (int i = 0; i < myMailBox.getClients().length; i++){
            System.out.println("Index " + i + " Client " + myMailBox.getClients()[i]);
            
        }
    }

    private static Client selectAnyClient() {
        Random r = new Random();
        int t = r.nextInt(100);
        if(t % 2 == 0){
            return new VipClient();
        }
        return new BaseClient();
    }
}
