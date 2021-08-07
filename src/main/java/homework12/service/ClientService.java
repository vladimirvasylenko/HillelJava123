package homework12.service;

import homework12.dao.ClientDao;
import homework12.dto.ClientDto;
import homework12.entities.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private final ClientDao clientDao;

    public ClientService(){
        clientDao = new ClientDao();
    }

    public List<ClientDto> findAllClients() {
        List<Client> clients = clientDao.findAllClients();
        List<ClientDto> result = new ArrayList<>();

        for (Client client: clients) {
            ClientDto dto = new ClientDto();
            dto.setName(client.getName());
            dto.setEmail(client.getEmail());
            dto.setPhone(client.getPhone());
            result.add(dto);
        }

        return result;
    }
}
