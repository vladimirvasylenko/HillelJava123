package homework12.dao;

import homework12.database.Database;
import homework12.entities.ClientStatus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientStatusDao {

    private static final String CLIENTS = "SELECT * FROM clients_status ORDER BY id";

    public List<ClientStatus> findAllClientStatus() {
        List<ClientStatus> resultList = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(CLIENTS);

            while (resultSet.next()) {
                ClientStatus clientStatus = new ClientStatus();
                clientStatus.setClientName(resultSet.getString("clientName"));
                clientStatus.setClientEmail(resultSet.getString("clientEmail"));
                clientStatus.setStatusAlias(resultSet.getString("statusAlias"));

                resultList.add(clientStatus);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return resultList;
    }
}
