package homework12.service;

import homework12.dao.StatusDao;
import homework12.dto.StatusDto;
import homework12.entities.Status;
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
public class StatusServiceTest {

    @Mock
    private StatusDao statusDao;

    private StatusService statusService;

    @BeforeEach
    public void setUp() {
        statusService = new StatusService(statusDao);
    }


    @Test
    public void findAllStatuses() {
        Status status = new Status();
        status.setAlias("Alias");
        status.setDescription("some description");

        when(statusDao.findAllStatuses()).thenReturn(Collections.singletonList(status));

        List<StatusDto> actualResult = statusService.findAllStatuses();

        assertEquals(1, actualResult.size());
        assertEquals("Alias", actualResult.get(0).getAlias());
        assertEquals("some description", actualResult.get(0).getDescription());

    }

    @Test
    public void findAllStatusesNotValid() {
        Status status = new Status();
        status.setAlias("Alias");
        status.setDescription("some description");

        when(statusDao.findAllStatuses()).thenReturn(Collections.singletonList(status));

        List<StatusDto> actualResult = statusService.findAllStatuses();

        assertNotEquals(2, actualResult.size());
        assertNotEquals("IncorrectAlias", actualResult.get(0).getAlias());
        assertNotEquals("incorrect some description", actualResult.get(0).getDescription());

    }

}