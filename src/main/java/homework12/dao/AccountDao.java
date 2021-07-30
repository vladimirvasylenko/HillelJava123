package homework12.dao;

import homework12.database.Database;
import homework12.entities.Account;
import homework12.entities.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDao {

    private static final String INSERT =
            "INSERT INTO accounts (clientId,number,value) VALUES (?,?,?)";
    private static final String ACCOUNT = "SELECT * FROM accounts ORDER BY id";
    private static final String UPDATE =
            "UPDATE accounts SET clientId=?, number=?, value=? WHERE id=?";
    private static final String DELETE_ACCOUNT = "DELETE FROM accounts WHERE id=?";
    private static final String ACCOUNT_BY_VALUE = "SELECT number FROM accounts WHERE value>?";

    public List<Account> findAllAccounts() {
        List<Account> resultList = new ArrayList<>();

        try (Connection connection = Database.getConnection()) {
            assert connection != null;
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery(ACCOUNT);

                while (resultSet.next()) {
                    Account account = new Account();
                    account.setId(resultSet.getInt("id"));
                    account.setClientId(resultSet.getInt("clientId"));
                    account.setNumber(resultSet.getString("number"));
                    account.setValue(resultSet.getDouble("value"));

                    resultList.add(account);
                }

            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return resultList;
    }

    public void save(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, account.getClientId());
            statement.setString(2, account.getNumber());
            statement.setDouble(3, account.getValue());
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void update(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE)) {
            statement.setInt(1, account.getClientId());
            statement.setString(2, account.getNumber());
            statement.setDouble(3, account.getValue());
            statement.setInt(4, account.getId());
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_ACCOUNT)) {
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }


    public List<String> findByValue(Double value) {
        List<String> resultList = new ArrayList<>();
        try ( Connection connection = Database.getConnection();
              PreparedStatement statement = connection.prepareStatement(ACCOUNT_BY_VALUE) ) {
            statement.setDouble(1, value);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                resultList.add(resultSet.getString("number"));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return resultList;
    }
}
