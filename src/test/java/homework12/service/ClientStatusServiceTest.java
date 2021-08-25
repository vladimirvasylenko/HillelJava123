package homework12.service;

import homework12.dao.ClientStatusDao;
import homework12.dto.ClientStatusDto;
import homework12.entities.ClientStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientStatusServiceTest {

    @Mock
    private ClientStatusDao clientStatusDao;

    private ClientStatusService clientStatusService;

    @BeforeEach
    public void setUp() {
        clientStatusService = new ClientStatusService(clientStatusDao);
    }


    @Test
    public void findAllClientStatus() {
        ClientStatus clientStatus = new ClientStatus();
        clientStatus.setClientName("ClientName");
        clientStatus.setClientEmail("ClientEmail");
        clientStatus.setStatusAlias("StatusAlias");

        when(clientStatusDao.findAllClientStatus()).thenReturn(Collections.singletonList(clientStatus));

        List<ClientStatusDto> actualResult = clientStatusService.findAllClientsStatuses();

        assertEquals(1, actualResult.size());
        assertEquals("ClientName", actualResult.get(0).getClientName());
        assertEquals("ClientEmail", actualResult.get(0).getClientEmail());
        assertEquals("StatusAlias", actualResult.get(0).getStatusAlias());

    }

    @Test
    public void findAllClientStatusNotValid() {
        ClientStatus clientStatus = new ClientStatus();
        clientStatus.setClientName("ClientName");
        clientStatus.setClientEmail("ClientEmail");
        clientStatus.setStatusAlias("StatusAlias");

        when(clientStatusDao.findAllClientStatus()).thenReturn(Collections.singletonList(clientStatus));

        List<ClientStatusDto> actualResult = clientStatusService.findAllClientsStatuses();

        assertNotEquals(2, actualResult.size());
        assertNotEquals("NotClientName", actualResult.get(0).getClientName());
        assertNotEquals("NotClientEmail", actualResult.get(0).getClientEmail());
        assertNotEquals("NotStatusAlias", actualResult.get(0).getStatusAlias());

    }

}