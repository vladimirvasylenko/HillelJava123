package homework12.service;

import homework12.dao.AccountDao;
import homework12.dto.AccountDto;
import homework12.entities.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Mock
    private AccountDao accountDao;

    private AccountService accountService;

    @BeforeEach
    public void setUp() {
        accountService = new AccountService(accountDao);
    }


    @Test
    public void findAllAccounts() {
        Account account = new Account();
        account.setNumber("1");
        account.setValue(500);

        when(accountDao.findAllAccounts()).thenReturn(Collections.singletonList(account));

        List<AccountDto> actualResult = accountService.findAllAccounts();

        assertEquals(1, actualResult.size());
        assertEquals(500, actualResult.get(0).getValue());
        assertEquals("1", actualResult.get(0).getNumber());

    }

    @Test
    public void findAllCustomersNotValid() {
        Account account = new Account();
        account.setNumber("1");
        account.setValue(500);

        when(accountDao.findAllAccounts()).thenReturn(Collections.singletonList(account));

        List<AccountDto> actualResult = accountService.findAllAccounts();

        assertNotEquals(2, actualResult.size());
        assertNotEquals(60, actualResult.get(0).getValue());
        assertNotEquals("2", actualResult.get(0).getNumber());

    }

}