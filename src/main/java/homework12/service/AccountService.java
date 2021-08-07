package homework12.service;

import homework12.dao.AccountDao;
import homework12.dto.AccountDto;
import homework12.entities.Account;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private final AccountDao accountDao;

    public AccountService(){
        accountDao = new AccountDao();
    }

    public List<AccountDto> findAllAccounts(){
        List<Account> accounts = accountDao.findAllAccounts();
        List<AccountDto> result = new ArrayList<>();

        for (Account account: accounts) {
            AccountDto dto = new AccountDto();
            dto.setClientId(account.getClientId());
            dto.setNumber(account.getNumber());
            result.add(dto);
        }
        return result;
    }
}
