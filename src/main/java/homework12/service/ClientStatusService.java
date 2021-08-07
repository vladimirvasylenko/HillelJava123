package homework12.service;

import homework12.dao.ClientDao;
import homework12.dto.ClientStatusDto;
import homework12.entities.ClientStatus;

import java.util.ArrayList;
import java.util.List;


public class ClientStatusService {

    private final ClientDao clientDao;

    public ClientStatusService(){
        clientDao = new ClientDao();
    }

    public List<ClientStatusDto> findAllClientsStatuses(){
        List<ClientStatus> clientStatuses = clientDao.findAllClientsStatuses();
        List<ClientStatusDto> result = new ArrayList<>();

        for (ClientStatus clientStatus: clientStatuses){
            ClientStatusDto dto = new ClientStatusDto();
            dto.setClientName(clientStatus.getClientName());
            dto.setClientEmail(clientStatus.getClientEmail());
            dto.setStatusAlias(clientStatus.getStatusAlias());

            result.add(dto);
        }
        return result;
    }


}
