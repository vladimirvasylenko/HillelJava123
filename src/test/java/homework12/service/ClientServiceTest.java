package homework12.service;

import homework12.dao.ClientDao;
import homework12.dto.ClientDto;
import homework12.entities.Client;
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
public class ClientServiceTest {

    @Mock
    private ClientDao clientDao;

    private ClientService clientService;

    @BeforeEach
    public void setUp() {
        clientService = new ClientService(clientDao);
    }


    @Test
    public void findAllClients() {
        Client client = new Client();
        client.setName("Name");
        client.setEmail("Email");
        client.setPhone(380937777777L);

        when(clientDao.findAllClients()).thenReturn(Collections.singletonList(client));

        List<ClientDto> actualResult = clientService.findAllClients();

        assertEquals(1, actualResult.size());
        assertEquals("Name", actualResult.get(0).getName());
        assertEquals("Email", actualResult.get(0).getEmail());
        assertEquals(380937777777L, actualResult.get(0).getPhone());

    }

    @Test
    public void findAllClientsNotValid() {
        Client client = new Client();
        client.setName("Name");
        client.setEmail("Email");
        client.setPhone(380937777777L);

        when(clientDao.findAllClients()).thenReturn(Collections.singletonList(client));

        List<ClientDto> actualResult = clientService.findAllClients();

        assertNotEquals(2, actualResult.size());
        assertNotEquals("NotName", actualResult.get(0).getName());
        assertNotEquals("NotEmail", actualResult.get(0).getEmail());
        assertNotEquals(380933333333L, actualResult.get(0).getPhone());

    }

}