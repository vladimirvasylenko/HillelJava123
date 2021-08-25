package homework12.service;

import homework12.dao.ClientStatusDao;
import homework12.dto.ClientStatusDto;
import homework12.entities.ClientStatus;

import java.util.ArrayList;
import java.util.List;


public class ClientStatusService {

    private final ClientStatusDao clientStatusDao;

    public ClientStatusService(ClientStatusDao clientStatusDao) {
        this.clientStatusDao = clientStatusDao;
    }


    public List<ClientStatusDto> findAllClientsStatuses(){
        List<ClientStatus> clientStatuses = clientStatusDao.findAllClientStatus();
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
