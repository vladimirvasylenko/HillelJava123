package homework12;

import homework12.dao.AccountDao;
import homework12.dao.ClientDao;
import homework12.entities.Client;
import homework12.entities.ClientStatus;

public class Main {
    public static void main(String[] args) {

        ClientDao clientDao = new ClientDao();
        AccountDao accountDao = new AccountDao();

        Client client = clientDao.findByPhone(380978888888L);
        System.out.println(client);

        for (String number : accountDao.findByValue(80d)) {
            System.out.println(number);
        }

        for (Client client1 : clientDao.findAllClientsByIdJoin()) {
            System.out.println(client1);
        }

        System.out.println();

        for (ClientStatus clientStatus : clientDao.clientStatusWithAge()) {
            System.out.println(clientStatus);
        }

    }
}
